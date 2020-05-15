package android.support.p002v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* renamed from: android.support.v7.app.AlertController$RecycleListView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a */
    public final int f1078a;

    /* renamed from: b */
    public final int f1079b;

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1390tu.f27212u);
        this.f1079b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1078a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
