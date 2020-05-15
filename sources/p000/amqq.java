package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: amqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqq extends aaab {

    /* renamed from: a */
    private final alss f75768a;

    /* renamed from: b */
    private final anar f75769b;

    /* renamed from: c */
    private final String f75770c;

    /* renamed from: d */
    private final Uri f75771d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amqq(alss alss, Context context, String str, Uri uri) {
        super(208, "SyncHighResPhoto");
        anar anar = new anar(context);
        this.f75768a = alss;
        this.f75770c = str;
        this.f75771d = uri;
        this.f75769b = anar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (cfyh.f186098a.mo6606a().mo83069a()) {
            bxvd da = amkw.f75120e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amkw amkw = (amkw) da.f164949b;
            amkw.f75123b = 5;
            amkw.f75122a |= 1;
            int a = anby.m63960a(this.f75770c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amkw amkw2 = (amkw) da.f164949b;
            int i = a - 1;
            if (a != 0) {
                amkw2.f75125d = i;
                amkw2.f75122a |= 4;
                try {
                    this.f75769b.mo41609a(this.f75771d);
                    this.f75768a.mo40728e(Status.f30107a);
                    almk a2 = almk.m61263a();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amkw amkw3 = (amkw) da.f164949b;
                    amkw3.f75124c = 1;
                    amkw3.f75122a |= 2;
                    a2.mo40515a((amkw) da.mo74062i());
                } catch (aaaj e) {
                    almk a3 = almk.m61263a();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amkw amkw4 = (amkw) da.f164949b;
                    amkw4.f75124c = 0;
                    amkw4.f75122a |= 2;
                    a3.mo40515a((amkw) da.mo74062i());
                    throw e;
                }
            } else {
                throw null;
            }
        } else {
            Log.e("SyncHighResPhotoOperation", "Sync high res photo is not enabled yet in GmsCore.");
            throw new aaaj(10, "Sync high res photo is not enabled yet in GmsCore.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f75768a.mo40728e(status);
    }
}
