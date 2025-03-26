document.addEventListener('DOMContentLoaded', function() {
    const images = [
'ImageSliderImages/bg1.avif',      
'ImageSliderImages/bg2.avif',      
'ImageSliderImages/bg3.avif',      
     
    ];

    const sliderImage = document.getElementById('sliderImage');
    const prevBtn = document.querySelector('.prev-btn');
    const nextBtn = document.querySelector('.next-btn');
    const dotsContainer = document.getElementById('dotsContainer');

    let currentIndex = 0;

    function initSlider() {
        for (let index = 0; index < images.length; index++) {
            const dot = document.createElement('div');
            if (index === 0) dot.classList.add('active');
            dot.addEventListener('click', () => goToSlide(index));
            dotsContainer.appendChild(dot);
        }
    
        sliderImage.src = images[currentIndex];
        sliderImage.alt = `Slide ${currentIndex + 1}`;
    }
    
    function goToSlide(index) {
        currentIndex = index;
        updateSlider();
    }
    function updateSlider() {
        sliderImage.src = images[currentIndex];
        sliderImage.alt = `Slide ${currentIndex + 1}`;
        
        const dots = document.querySelectorAll('.dot');
        dots.forEach((dot, index) => {
            dot.classList.toggle('active', index === currentIndex);
        });
    }

    function nextSlide() {
        currentIndex = (currentIndex + 1) % images.length;
        updateSlider();
    }

    function prevSlide() {
        currentIndex = (currentIndex - 1 + images.length) % images.length;
        updateSlider();
    }
    nextBtn.addEventListener('click', nextSlide);
    prevBtn.addEventListener('click', prevSlide);

    document.addEventListener('keydown', (e) => {
        if (e.key === 'ArrowRight') nextSlide();
        if (e.key === 'ArrowLeft') prevSlide();
    });

    initSlider();
});