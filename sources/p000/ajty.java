package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajty extends rjx {

    /* renamed from: a */
    public static final /* synthetic */ int f71279a = 0;

    /* renamed from: b */
    private static final rjo f71280b = new rjo("Nearby.SHARING_API", new ajtt(), new rje());

    public ajty(Context context) {
        super(context, f71280b, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public static rnt m59007a(aucf aucf) {
        return new ajtr(aucf);
    }

    /* renamed from: c */
    public static rnt m59008c(aucf aucf) {
        return new ajts(aucf);
    }

    /* renamed from: G */
    public final aucb mo38893G() {
        roz b = rpa.m34196b();
        b.f43472a = new ajth();
        b.f43473b = new Feature[]{ahca.f66970a};
        return mo24701a(b.mo24977a());
    }

    /* renamed from: b */
    public final aucb mo38904b() {
        roz b = rpa.m34196b();
        b.f43472a = new ajtl();
        b.f43473b = new Feature[]{ahca.f66970a};
        return mo24701a(b.mo24977a());
    }

    /* renamed from: d */
    public final aucb mo38910d() {
        roz b = rpa.m34196b();
        b.f43472a = new ajtp();
        b.f43473b = new Feature[]{ahca.f66970a};
        return mo24701a(b.mo24977a());
    }

    /* renamed from: e */
    public final aucb mo38912e() {
        roz b = rpa.m34196b();
        b.f43472a = new ajss();
        b.f43473b = new Feature[]{ahca.f66970a};
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo38894a() {
        roz b = rpa.m34196b();
        b.f43472a = new ajtj();
        b.f43473b = new Feature[]{ahca.f66970a};
        return mo24701a(b.mo24977a());
    }

    /* renamed from: c */
    public final aucb mo38908c() {
        roz b = rpa.m34196b();
        b.f43472a = new ajtn();
        b.f43473b = new Feature[]{ahca.f66970a};
        return mo24701a(b.mo24977a());
    }

    /* renamed from: b */
    public final aucb mo38905b(boolean z) {
        roz b = rpa.m34196b();
        b.f43472a = new ajtk(z);
        b.f43473b = new Feature[]{ahca.f66970a};
        return mo24732b(b.mo24977a());
    }

    /* renamed from: d */
    public final void mo38911d(ShareTarget shareTarget) {
        roz b = rpa.m34196b();
        b.f43472a = new ajsz(shareTarget);
        b.f43473b = new Feature[]{ahca.f66970a};
        mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo38895a(int i, int i2, ContactFilter contactFilter) {
        roz b = rpa.m34196b();
        b.f43472a = new ajtc(i, i2, contactFilter);
        b.f43473b = new Feature[]{ahca.f66970a};
        return mo24701a(b.mo24977a());
    }

    /* renamed from: c */
    public final void mo38909c(ShareTarget shareTarget) {
        roz b = rpa.m34196b();
        b.f43472a = new ajtb(shareTarget);
        b.f43473b = new Feature[]{ahca.f66970a};
        mo24732b(b.mo24977a());
    }

    /* renamed from: b */
    public final void mo38906b(ajud ajud) {
        String valueOf = String.valueOf(ajud.class.getName());
        mo24698a(roe.m34171a(ajud, valueOf.length() == 0 ? new String("SendSurface") : "SendSurface".concat(valueOf)));
    }

    /* renamed from: a */
    public final aucb mo38896a(ContactFilter contactFilter) {
        roz b = rpa.m34196b();
        b.f43472a = new ajtd(contactFilter);
        b.f43473b = new Feature[]{ahca.f66970a};
        return mo24701a(b.mo24977a());
    }

    /* renamed from: b */
    public final void mo38907b(ShareTarget shareTarget) {
        roz b = rpa.m34196b();
        b.f43472a = new ajta(shareTarget);
        b.f43473b = new Feature[]{ahca.f66970a};
        mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo38897a(ShareTarget shareTarget) {
        roz b = rpa.m34196b();
        b.f43472a = new ajsy(shareTarget);
        b.f43473b = new Feature[]{ahca.f66970a};
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo38898a(CharSequence charSequence) {
        roz b = rpa.m34196b();
        b.f43472a = new ajsr(charSequence);
        b.f43473b = new Feature[]{ahca.f66970a};
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final void mo38899a(int i) {
        roz b = rpa.m34196b();
        b.f43472a = new ajto(i);
        b.f43473b = new Feature[]{ahca.f66970a};
        mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final void mo38900a(ajud ajud) {
        String valueOf = String.valueOf(ajud.class.getName());
        mo24698a(roe.m34171a(ajud, valueOf.length() == 0 ? new String("ReceiveSurface") : "ReceiveSurface".concat(valueOf)));
    }

    /* renamed from: a */
    public final void mo38901a(ajud ajud, int i) {
        String valueOf = String.valueOf(ajud.class.getName());
        rod a = mo24714a(ajud, valueOf.length() == 0 ? new String("ReceiveSurface") : "ReceiveSurface".concat(valueOf));
        akbh akbh = new akbh(a);
        ajsv ajsv = new ajsv(akbh, i);
        ajsw ajsw = new ajsw(akbh);
        rom a2 = ron.m34179a();
        a2.f43443a = ajsv;
        a2.f43444b = ajsw;
        a2.f43445c = a;
        a2.f43446d = new Feature[]{ahca.f66970a};
        mo24700a(a2.mo24973a());
    }

    /* renamed from: a */
    public final void mo38902a(ajud ajud, ajsn ajsn, int i) {
        ajxo ajxo = new ajxo(mo24714a(ajsn, ajsn.class.getName()));
        String valueOf = String.valueOf(ajud.class.getName());
        rod a = mo24714a(ajud, valueOf.length() == 0 ? new String("SendSurface") : "SendSurface".concat(valueOf));
        akbh akbh = new akbh(a);
        ajst ajst = new ajst(akbh, ajxo, i);
        ajsu ajsu = new ajsu(akbh, ajxo);
        rom a2 = ron.m34179a();
        a2.f43443a = ajst;
        a2.f43444b = ajsu;
        a2.f43445c = a;
        a2.f43446d = new Feature[]{ahca.f66970a};
        mo24700a(a2.mo24973a());
    }

    /* renamed from: a */
    public final void mo38903a(Account account) {
        roz b = rpa.m34196b();
        b.f43472a = new ajtg(account);
        b.f43473b = new Feature[]{ahca.f66970a};
        mo24732b(b.mo24977a());
    }
}
