document.addEventListener('DOMContentLoaded', function () {
    const stars = document.querySelectorAll('.star-rating span');
    const ratingInput = document.getElementById('rating-input');
    let currentRating = 0;

    stars.forEach((star, index) => {
        star.addEventListener('click', () => {
            const selectedRating = index + 1;

            // Если клик по уже выбранной звезде — отменяем выбор
            if (selectedRating === currentRating) {
                currentRating = 0;
                ratingInput.value = 0;
            } else {
                currentRating = selectedRating;
                ratingInput.value = selectedRating;
            }

            // Обновить визуально
            stars.forEach((s, i) => {
                s.classList.toggle('active', i < currentRating);
            });
        });
    });
});