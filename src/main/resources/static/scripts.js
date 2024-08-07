document.addEventListener('DOMContentLoaded', () => {
    console.log('Document is fully loaded and parsed');

    // Formulario de inicio de sesión
    const loginForm = document.querySelector('form[action="/login"]');
    if (loginForm) {
        loginForm.addEventListener('submit', function(event) {
            const username = document.getElementById('username').value;
            const password = document.getElementById('password').value;

            if (!username || !password) {
                event.preventDefault();
                alert('Por favor, complete todos los campos.');
            }
        });
    }

    // Formulario de agregar Odontólogo
    const odontologoForm = document.querySelector('form[action="/odontologo/add"]');
    if (odontologoForm) {
        odontologoForm.addEventListener('submit', function(event) {
            const name = document.getElementById('name').value;
            const surname = document.getElementById('surname').value;
            const registration = document.getElementById('registration').value;

            if (!name || !surname || !registration) {
                event.preventDefault();
                alert('Por favor, complete todos los campos.');
            }
        });
    }

    // Formulario de agregar Paciente
    const pacienteForm = document.querySelector('form[action="/paciente/add"]');
    if (pacienteForm) {
        pacienteForm.addEventListener('submit', function(event) {
            const name = document.getElementById('name').value;
            const surname = document.getElementById('surname').value;
            const address = document.getElementById('address').value;
            const dni = document.getElementById('dni').value;
            const registrationDate = document.getElementById('registrationDate').value;

            if (!name || !surname || !address || !dni || !registrationDate) {
                event.preventDefault();
                alert('Por favor, complete todos los campos.');
            }
        });
    }

    // Formulario de agregar Turno
    const turnoForm = document.querySelector('form[action="/turno/add"]');
    if (turnoForm) {
        turnoForm.addEventListener('submit', function(event) {
            const patientId = document.getElementById('patientId').value;
            const dentistId = document.getElementById('dentistId').value;
            const date = document.getElementById('date').value;
            const time = document.getElementById('time').value;

            if (!patientId || !dentistId || !date || !time) {
                event.preventDefault();
                alert('Por favor, complete todos los campos.');
            }
        });
    }

    // Manejo de datos en la tabla (ejemplo para list.html)
    const tables = document.querySelectorAll('table');
    tables.forEach(table => {
        const rows = table.querySelectorAll('tbody tr');
        rows.forEach(row => {
            row.addEventListener('click', () => {
                const id = row.querySelector('td:first-child').innerText;
                window.location.href = `/detalle/${id}`;
            });
        });
    });

    // Menú de navegación (si existe)
    const menuLinks = document.querySelectorAll('.menu a');
    menuLinks.forEach(link => {
        link.addEventListener('click', function(event) {
            event.preventDefault();
            const url = this.getAttribute('href');
            if (url === '/logout') {
                // Manejo de logout
                fetch('/logout', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify({ logout: true })
                })
                .then(() => {
                    window.location.href = '/login';
                });
            } else {
                window.location.href = url;
            }
        });
    });
});
