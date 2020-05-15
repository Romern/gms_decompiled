package p000;

import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import com.google.android.gms.plus.sharebox.AddToCircleChimeraActivity;

/* renamed from: aokt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aokt implements rkl {

    /* renamed from: a */
    final /* synthetic */ AddToCircleChimeraActivity f78361a;

    /* renamed from: b */
    private final String f78362b;

    /* renamed from: c */
    private final ImageView f78363c;

    public aokt(AddToCircleChimeraActivity addToCircleChimeraActivity, String str, ImageView imageView) {
        this.f78361a = addToCircleChimeraActivity;
        this.f78362b = str;
        this.f78363c = imageView;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        ParcelFileDescriptor b;
        allh allh = (allh) rkk;
        if (allh.mo7183bo().mo17710c() && (b = allh.mo40486b()) != null) {
            new aoks(this.f78361a, this.f78362b, this.f78363c, b).execute(new Void[0]);
        }
    }
}
