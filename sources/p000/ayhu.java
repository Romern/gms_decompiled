package p000;

import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;

/* renamed from: ayhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhu extends ayfu {

    /* renamed from: c */
    final /* synthetic */ String f97627c;

    /* renamed from: d */
    final /* synthetic */ axrs f97628d;

    /* renamed from: e */
    final /* synthetic */ ayja f97629e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhu(ayja ayja, String str, String str2, axrs axrs) {
        super(str);
        this.f97629e = ayja;
        this.f97627c = str2;
        this.f97628d = axrs;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0063=Splitter:B:26:0x0063, B:21:0x005a=Splitter:B:21:0x005a} */
    /* renamed from: a */
    public final void mo53991a() {
        Cursor c;
        int i;
        try {
            ayja ayja = this.f97629e;
            axuv axuv = ayja.f97729h;
            axue b = ayja.f97744w.mo53996b(ayja.f97726e, this.f97627c);
            axus axus = axus.DYNAMIC;
            String str = this.f97627c;
            axyo a = axuv.f96425f.mo53771a(b.f96377a);
            try {
                c = axuv.mo53608c(b, str, axuv.f96427h.mo53808b().f96814a);
                if (c.moveToFirst()) {
                    if (axuv.m83263a(axxj.m83472a(c).f96647b) != axus.STATIC) {
                        if (axus == axus.DYNAMIC) {
                        }
                    }
                    if (c != null) {
                        c.close();
                    }
                    a.close();
                    i = 4006;
                    this.f97628d.mo53439a(new AddLocalCapabilityResponse(i));
                    return;
                }
                if (!axuv.mo53603a(b, axuv.f96427h.mo53808b().f96814a, axus, str)) {
                    i = 8;
                } else {
                    i = 0;
                }
                if (c != null) {
                    c.close();
                }
                a.close();
                this.f97628d.mo53439a(new AddLocalCapabilityResponse(i));
                return;
            } catch (Throwable th) {
                a.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("WearableService", "addLocalCapability: exception during processing", e);
            this.f97628d.mo53439a(new AddLocalCapabilityResponse(8));
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }
}
