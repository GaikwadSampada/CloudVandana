document.addEventListener('DOMContentLoaded', function() {
    const taskInput = document.getElementById('taskInput');
    const addTaskBtn = document.getElementById('addTaskBtn');
    const taskList = document.getElementById('taskList');

    function addTask() {
        const taskText = taskInput.value.trim();
        
        if (taskText !== '') {
            const taskItem = document.createElement('li');
            taskItem.className = 'task-item';

            const taskTextSpan = document.createElement('span');
            taskTextSpan.textContent = taskText;

            const deleteBtn = document.createElement('button');
            deleteBtn.className = 'delete-btn';
            deleteBtn.textContent = 'Delete';
            deleteBtn.addEventListener('click', function() {
                taskItem.remove();
            });

            taskItem.appendChild(taskTextSpan);
            taskItem.appendChild(deleteBtn);
            taskList.appendChild(taskItem);

            taskInput.value = '';
        } else {
            alert('Please enter a task!');
        }
    }

    addTaskBtn.addEventListener('click', addTask);
    taskInput.addEventListener('keypress', function(e) {
        if (e.key === 'Enter') {
            addTask();
        }
    });
});
