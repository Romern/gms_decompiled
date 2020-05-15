package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.items.ItemGroup;

/* renamed from: bjaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjaf implements biyr {

    /* renamed from: a */
    private final TemplateLayout f122409a;

    /* renamed from: b */
    private ListView f122410b;

    /* renamed from: c */
    private Drawable f122411c;

    /* renamed from: d */
    private Drawable f122412d;

    /* renamed from: e */
    private int f122413e;

    /* renamed from: f */
    private int f122414f;

    public bjaf(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.f122409a = templateLayout;
        Context context = templateLayout.getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bizg.f122379m, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            bizn bizn = new bizn((ItemGroup) new bizw(context).mo64929a(resourceId));
            ListView a = mo64940a();
            if (a != null) {
                a.setAdapter((ListAdapter) bizn);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize == -1) {
            mo64941a(obtainStyledAttributes.getDimensionPixelSize(3, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0));
        } else {
            mo64941a(dimensionPixelSize, 0);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    private final void m103096c() {
        ListView a = mo64940a();
        if (a != null) {
            int i = Build.VERSION.SDK_INT;
            if (this.f122409a.isLayoutDirectionResolved()) {
                if (this.f122412d == null) {
                    this.f122412d = a.getDivider();
                }
                InsetDrawable a2 = bjau.m103127a(this.f122412d, this.f122413e, this.f122414f, this.f122409a);
                this.f122411c = a2;
                a.setDivider(a2);
            }
        }
    }

    /* renamed from: a */
    public final ListView mo64940a() {
        if (this.f122410b == null) {
            View b = this.f122409a.mo71345b(16908298);
            if (b instanceof ListView) {
                this.f122410b = (ListView) b;
            }
        }
        return this.f122410b;
    }

    /* renamed from: b */
    public final void mo64942b() {
        if (this.f122411c == null) {
            m103096c();
        }
    }

    /* renamed from: a */
    public final void mo64941a(int i, int i2) {
        this.f122413e = i;
        this.f122414f = i2;
        m103096c();
    }
}
