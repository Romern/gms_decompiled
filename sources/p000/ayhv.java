package p000;

import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse;

/* renamed from: ayhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhv extends ayfu {

    /* renamed from: c */
    final /* synthetic */ String f97630c;

    /* renamed from: d */
    final /* synthetic */ axrs f97631d;

    /* renamed from: e */
    final /* synthetic */ ayja f97632e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhv(ayja ayja, String str, String str2, axrs axrs) {
        super(str);
        this.f97632e = ayja;
        this.f97630c = str2;
        this.f97631d = axrs;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0052=Splitter:B:17:0x0052, B:22:0x005b=Splitter:B:22:0x005b} */
    /* renamed from: a */
    public final void mo53991a() {
        Cursor c;
        int i;
        try {
            ayja ayja = this.f97632e;
            axuv axuv = ayja.f97729h;
            axue b = ayja.f97744w.mo53996b(ayja.f97726e, this.f97630c);
            axus axus = axus.DYNAMIC;
            String str = this.f97630c;
            axyo a = axuv.f96425f.mo53771a(b.f96377a);
            try {
                c = axuv.mo53608c(b, str, axuv.f96427h.mo53808b().f96814a);
                if (!c.moveToFirst() || axuv.m83263a(axxj.m83472a(c).f96647b) != axus) {
                    if (c != null) {
                        c.close();
                    }
                    a.close();
                    i = 4007;
                } else {
                    if (!axuv.mo53604a(b, axuv.f96427h.mo53808b().f96814a, str)) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    if (c != null) {
                        c.close();
                    }
                    a.close();
                }
                this.f97631d.mo53459a(new RemoveLocalCapabilityResponse(i));
                return;
            } catch (Throwable th) {
                a.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("WearableService", "removeLocalCapability: exception during processing", e);
            this.f97631d.mo53459a(new RemoveLocalCapabilityResponse(8));
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }
}
