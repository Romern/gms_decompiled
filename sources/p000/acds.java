package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: acds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acds implements acjh {

    /* renamed from: a */
    private final rnt f59605a;

    /* renamed from: b */
    private final byte[] f59606b;

    /* renamed from: c */
    private final baam f59607c;

    public acds(rnt rnt, byte[] bArr, baam baam) {
        this.f59605a = rnt;
        this.f59606b = bArr;
        this.f59607c = baam;
    }

    /* renamed from: a */
    public final void mo32708a() {
        try {
            this.f59607c.f100379h = (bygw) bxvk.m124014a(bygw.f166398b, this.f59606b);
            this.f59605a.mo11797a(Status.f30107a);
        } catch (bxwf e) {
            this.f59605a.mo11797a(ackq.m49339a(getClass().getSimpleName(), "Serialized ChannelConfigList cannot be parsed."));
        }
    }

    /* renamed from: a */
    public final void mo32709a(Status status) {
        this.f59605a.mo11797a(status);
    }
}
