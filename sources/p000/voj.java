package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import android.support.p002v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: voj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class voj extends voi {

    /* renamed from: A */
    public final NinePatchDrawable f49674A;

    /* renamed from: B */
    public final RectF f49675B;

    /* renamed from: y */
    public final int f49676y;

    /* renamed from: z */
    public final Paint f49677z = new Paint();

    public voj(Context context, RecyclerView recyclerView, View view, vog vog) {
        super(context, recyclerView, view, vog);
        Resources resources = context.getResources();
        this.f49674A = (NinePatchDrawable) m40920a(context, (int) C0126R.C0127drawable.drive_menu_submenu_background);
        this.f49677z.setDither(true);
        this.f49677z.setAntiAlias(true);
        this.f49677z.setColor(-1);
        this.f49677z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f49677z.setTextAlign(Paint.Align.CENTER);
        this.f49677z.setTextSize((float) ((int) TypedValue.applyDimension(2, 26.0f, resources.getDisplayMetrics())));
        this.f49675B = new RectF();
        this.f49676y = (int) TypedValue.applyDimension(1, 300.0f, resources.getDisplayMetrics());
    }

    /* renamed from: a */
    public final void mo28690a(int i) {
        int i2 = this.f49667r;
        super.mo28690a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo28697e() {
        this.f49664o = "";
        super.mo28696d();
    }
}
