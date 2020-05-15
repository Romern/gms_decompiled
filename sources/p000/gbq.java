package p000;

import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.Status;
import java.util.UUID;

/* renamed from: gbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gbq extends aaab {

    /* renamed from: a */
    public static final Logger f17854a = tea.m36798a("api_set_asterism_consent");

    /* renamed from: b */
    public final gbx f17855b;

    /* renamed from: c */
    public final SetAsterismConsentRequest f17856c;

    /* renamed from: d */
    public final Context f17857d;

    /* renamed from: e */
    public int f17858e;

    /* renamed from: f */
    public final tds f17859f;

    /* renamed from: g */
    public final UUID f17860g;

    /* renamed from: h */
    public byte[] f17861h;

    /* renamed from: i */
    private final tdl f17862i = new gbn(this, new snr(new sns(9)));

    /* renamed from: j */
    private final gbo f17863j;

    public gbq(Context context, gbx gbx, SetAsterismConsentRequest setAsterismConsentRequest) {
        super(ErrorInfo.TYPE_SDU_UNKNOWN, "SetAsterismConsent");
        this.f17857d = context;
        this.f17855b = gbx;
        this.f17856c = setAsterismConsentRequest;
        this.f17859f = tds.m36774a(context);
        this.f17860g = UUID.randomUUID();
        this.f17863j = new gbo(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        cbnw cbnw;
        int i;
        boolean z;
        this.f17859f.mo26401a(this.f17860g, 15);
        if (!cdfb.m132904b()) {
            this.f17859f.mo26414b(this.f17860g, 56, 62);
            mo6503a(new Status(34500));
            return;
        }
        SetAsterismConsentRequest setAsterismConsentRequest = this.f17856c;
        if (setAsterismConsentRequest == null) {
            this.f17859f.mo26414b(this.f17860g, 56, 63);
            mo6503a(new Status(34502));
            return;
        }
        this.f17858e = setAsterismConsentRequest.f9829a;
        int i2 = setAsterismConsentRequest.f9830b;
        if (i2 == 1) {
            cbnw = cbnw.CONSTELLATION;
        } else if (i2 != 2) {
            this.f17859f.mo26414b(this.f17860g, 56, 64);
            mo6503a(new Status(34502));
            return;
        } else {
            cbnw = cbnw.RCS;
        }
        SetAsterismConsentRequest setAsterismConsentRequest2 = this.f17856c;
        int i3 = setAsterismConsentRequest2.f9834f;
        if (i3 == 1) {
            z = true;
            i = 3;
        } else if (i3 == 2 || i3 == 3) {
            z = false;
            i = 4;
        } else {
            this.f17859f.mo26414b(this.f17860g, 56, 65);
            mo6503a(new Status(34502));
            return;
        }
        int i4 = setAsterismConsentRequest2.f9836h;
        gbp gbp = new gbp(this, context, this.f17859f, cbnw, z, setAsterismConsentRequest2.f9835g, this.f17862i);
        if (i4 == 2) {
            int[] iArr = this.f17856c.f9832d;
            if (iArr.length == 0) {
                this.f17859f.mo26414b(this.f17860g, 56, 66);
                mo6503a(new Status(34502));
                return;
            }
            SetAsterismConsentRequest setAsterismConsentRequest3 = this.f17863j.f17846a.f17856c;
            this.f17861h = tdf.m36745a(context, cbnw, setAsterismConsentRequest3.f9831c, setAsterismConsentRequest3.f9837i, setAsterismConsentRequest3.f9833e.longValue(), iArr, i, gbp);
        } else {
            SetAsterismConsentRequest setAsterismConsentRequest4 = this.f17856c;
            String str = setAsterismConsentRequest4.f9838j;
            String str2 = setAsterismConsentRequest4.f9839k;
            if (bmxx.m108577a(str) || bmxx.m108577a(str2)) {
                this.f17859f.mo26414b(this.f17860g, 56, 67);
                mo6503a(new Status(34502));
                return;
            }
            gbo gbo = this.f17863j;
            SetAsterismConsentRequest setAsterismConsentRequest5 = gbo.f17846a.f17856c;
            this.f17861h = tdf.m36743a(context, cbnw, setAsterismConsentRequest5.f9831c, i4, setAsterismConsentRequest5.f9837i, setAsterismConsentRequest5.f9833e.longValue(), str, str2, bmxx.m108578b(gbo.f17846a.f17856c.f9840l), bmxx.m108578b(gbo.f17846a.f17856c.f9841m), i, gbp);
        }
        if (this.f17861h == null) {
            this.f17859f.mo26414b(this.f17860g, 56, 68);
            mo6503a(new Status(34503));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f17855b.mo11611a(status, new SetAsterismConsentResponse(this.f17858e));
    }
}
