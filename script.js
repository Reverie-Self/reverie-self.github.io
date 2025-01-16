document.addEventListener('DOMContentLoaded', () => {
    const hamburger = document.querySelector('.hamburger');
    const menuItems = document.querySelector('.menu-items');

    hamburger.addEventListener('click', () => {
        // Toggle menu visibility
        menuItems.classList.toggle('active');

        // Update accessibility attributes
        const expanded = hamburger.getAttribute('aria-expanded') === 'true' || false;
        hamburger.setAttribute('aria-expanded', !expanded);
    });
});