<%--
  Created by IntelliJ IDEA.
  User: rodriquesperry
  Date: 12/1/21
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%@ include file="partials/head.jsp"%>
    <title>Title</title>
</head>
<body>

    <div class="container" style="margin-top: 7rem">
        <h2 class="mb-3">Pizza Type</h2>
        <form action="/pizza-order" method="post">

            <%-- Inputs for pizza type selection --%>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="crust">Crust Type</label>
                </div>
                <select class="custom-select" name="crust" id="crust">
                    <option selected>Choose...</option>
                    <option value="thin">Thin Crust</option>
                    <option value="pan">Pan Crust</option>
                    <option value="stuffed">Stuffed Crust</option>
                </select>
            </div>

            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="sauce">Sauce Type</label>
                </div>
                <select class="custom-select" name="sauce" id="sauce">
                    <option selected>Choose...</option>
                    <option value="red">Marinara Sauce</option>
                    <option value="buffalo">Buffalo Sauce</option>
                    <option value="garlic">White Garlic Sauce</option>
                </select>
            </div>

            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="size">Size</label>
                </div>
                <select class="custom-select" name="size" id="size">
                    <option selected>Choose...</option>
                    <option value="small">Small</option>
                    <option value="medium">Medium</option>
                    <option value="large">Large</option>
                </select>
            </div>

            <%-- Checkboxes for Toppings --%>
            <h2 class="mt-4">Toppings</h2>
            <div class="row mx-auto">
                <div class="col-4 my-3 form-check">
                    <input class="form-check-input" type="checkbox" name="toppings" value="pepperoni" id="pepperoni">
                    <label class="form-check-label" for="pepperoni">
                        Pepperoni
                    </label>
                </div>

                <div class="col-4 my-3 form-check">
                    <input class="form-check-input" type="checkbox" name="toppings" value="mushroom" id="mushroom">
                    <label class="form-check-label" for="mushroom">
                        Mushroom
                    </label>
                </div>

                <div class="col-4 my-3 form-check">
                    <input class="form-check-input" type="checkbox" name="toppings" value="sausage" id="sausage">
                    <label class="form-check-label" for="sausage">
                        Sausage
                    </label>
                </div>

                <div class="col-4 my-3 form-check">
                    <input class="form-check-input" type="checkbox" name="toppings" value="onion" id="onion">
                    <label class="form-check-label" for="onion">
                        Onion
                    </label>
                </div>

                <div class="col-4 my-3 form-check">
                    <input class="form-check-input" type="checkbox" name="toppings" value="olives" id="olives">
                    <label class="form-check-label" for="olives">
                        Black Olives
                    </label>
                </div>

                <div class="col-4 my-3 form-check">
                    <input class="form-check-input" type="checkbox" name="toppings" value="green peppers" id="peppers">
                    <label class="form-check-label" for="peppers">
                        Green Peppers
                    </label>
                </div>

                <div class="col-4 my-3 form-check">
                    <input class="form-check-input" type="checkbox" name="toppings" value="spinach leaf" id="spinach">
                    <label class="form-check-label" for="spinach">
                        Spinach Leaf
                    </label>
                </div>

                <div class="col-4 my-3 form-check">
                    <input class="form-check-input" type="checkbox" name="toppings" value="chicken" id="chicken">
                    <label class="form-check-label" for="chicken">
                        Chicken
                    </label>
                </div>

                <div class="col-4 my-3 form-check">
                    <input class="form-check-input" type="checkbox" name="toppings" value="green olives" id="gOlives">
                    <label class="form-check-label" for="gOlives">
                        Green Olives
                    </label>
                </div>
            </div>

            <%-- Delivery Address input --%>
            <div class="form-group my-3">
                <label for="homeAddress"><h2>Delivery Address</h2></label>
                <input type="text" name="addy" class="form-control" id="homeAddress">
            </div>
            <%-- Button for form --%>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</body>
</html>
