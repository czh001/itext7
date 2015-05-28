package com.itextpdf.model.element;

import com.itextpdf.model.renderer.IRenderer;
import com.itextpdf.model.renderer.ListItemRenderer;

public class ListItem extends Div {

    public ListItem() {
        super();
    }

    public ListItem(String text) {
        this();
        add(new Paragraph(text).setMarginTop(0).setMarginBottom(0));
    }

    @Override
    public IRenderer makeRenderer() {
        if (nextRenderer != null) {
            IRenderer renderer = nextRenderer;
            nextRenderer = null;
            return renderer;
        }
        return new ListItemRenderer(this);
    }


    //    public ListItem add(BlockElement element) {
//        childElements.add(element);
//        return this;
//    }

}