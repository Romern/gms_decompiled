package p000;

import android.os.Build;

/* renamed from: aiwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiwy extends buqn {

    /* renamed from: a */
    final /* synthetic */ int f69965a;

    /* renamed from: b */
    final /* synthetic */ aiwz f69966b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiwy(aiwz aiwz, String str, int i) {
        super(str);
        this.f69966b = aiwz;
        this.f69965a = i;
    }

    public final void run() {
        aixb aixb = this.f69966b.f69967a;
        int i = this.f69965a;
        int i2 = Build.VERSION.SDK_INT;
        for (aixa aixa : aixb.f69968a) {
            srn srn = ahfq.f67120a;
            aixa.mo38195a(i);
        }
    }
}
