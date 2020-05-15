package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.lang.ref.WeakReference;

/* renamed from: azch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azch extends soa {

    /* renamed from: a */
    public final WeakReference f98972a;

    /* renamed from: b */
    public final LocalEntityId f98973b;

    /* renamed from: c */
    private final Handler f98974c;

    public azch(azcj azcj, LocalEntityId localEntityId, Handler handler) {
        super(9, null);
        this.f98972a = new WeakReference(azcj);
        this.f98973b = localEntityId;
        this.f98974c = handler;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azal.a(android.content.Context, com.google.android.libraries.matchstick.data.LocalEntityId, boolean):android.graphics.Bitmap
     arg types: [android.content.Context, com.google.android.libraries.matchstick.data.LocalEntityId, int]
     candidates:
      azal.a(android.content.Context, java.util.List, boolean):android.graphics.Bitmap
      azal.a(android.content.Context, com.google.android.libraries.matchstick.data.LocalEntityId, boolean):android.graphics.Bitmap */
    public final void run() {
        Bitmap bitmap;
        azcj azcj = (azcj) this.f98972a.get();
        if (azcj != null) {
            bitmap = azal.m85136a(azcj.f98977b, azal.m85137a(azcj.f98977b, this.f98973b, true));
        } else {
            bitmap = null;
        }
        this.f98974c.post(new azcg(this, bitmap));
    }
}
