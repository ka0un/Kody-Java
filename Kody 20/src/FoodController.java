public class FoodController {
    @Wire
    private FoodService foodService;
    public void HandleCooking(){
        foodService.CookFood();
    }
}
