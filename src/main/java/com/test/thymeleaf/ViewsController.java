package com.test.thymeleaf;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

@Controller("/views")
class ViewsController {

    @View("index")
    @Get()
    public HttpResponse index() {
        return HttpResponse.ok();
    }

    @View("destination")
    @Get("destination")
    public HttpResponse destination() {
        return HttpResponse.ok();
    }

}