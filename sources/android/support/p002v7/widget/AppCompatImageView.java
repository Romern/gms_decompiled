package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.AppCompatImageView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppCompatImageView extends ImageView {

    /* renamed from: a */
    private final C1493xp f1185a;

    /* renamed from: b */
    private final C1499xv f1186b;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1493xp xpVar = this.f1185a;
        if (xpVar != null) {
            xpVar.mo16498a();
        }
        C1499xv xvVar = this.f1186b;
        if (xvVar != null) {
            xvVar.mo16517b();
        }
    }

    public final boolean hasOverlappingRendering() {
        return this.f1186b.mo16516a() && super.hasOverlappingRendering();
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1493xp xpVar = this.f1185a;
        if (xpVar != null) {
            xpVar.mo16502b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1493xp xpVar = this.f1185a;
        if (xpVar != null) {
            xpVar.mo16499a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1499xv xvVar = this.f1186b;
        if (xvVar != null) {
            xvVar.mo16517b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C1499xv xvVar = this.f1186b;
        if (xvVar != null) {
            xvVar.mo16517b();
        }
    }

    public void setImageResource(int i) {
        C1499xv xvVar = this.f1186b;
        if (xvVar != null) {
            xvVar.mo16514a(i);
        }
    }

    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1499xv xvVar = this.f1186b;
        if (xvVar != null) {
            xvVar.mo16517b();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ado.m520a(context);
        adm.m515a(this, getContext());
        C1493xp xpVar = new C1493xp(this);
        this.f1185a = xpVar;
        xpVar.mo16501a(attributeSet, i);
        C1499xv xvVar = new C1499xv(this);
        this.f1186b = xvVar;
        xvVar.mo16515a(attributeSet, i);
    }
}
