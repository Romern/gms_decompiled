package p000;

import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.service.CryptauthChimeraService;
import java.util.List;

/* renamed from: itn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itn extends iqx implements aaai {

    /* renamed from: a */
    private final CryptauthChimeraService f21695a;

    /* renamed from: b */
    private final aaag f21696b;

    public itn(CryptauthChimeraService cryptauthChimeraService, aaag aaag) {
        this.f21695a = cryptauthChimeraService;
        this.f21696b = aaag;
    }

    /* renamed from: a */
    public final void mo13268a(irb irb, String str, Account account) {
        this.f21696b.mo16659a(this.f21695a, new iuc(irb, str, account));
    }

    /* renamed from: a */
    public final void mo13269a(irb irb, String str, Account account, ClientPublicKey clientPublicKey) {
        this.f21696b.mo16659a(this.f21695a, new itw(irb, str, account, clientPublicKey));
    }

    /* renamed from: a */
    public final void mo13270a(ire ire, String str, Account account) {
        this.f21696b.mo16659a(this.f21695a, new itr(ire, str, account));
    }

    /* renamed from: a */
    public final void mo13271a(ire ire, byte[] bArr) {
        this.f21696b.mo16659a(this.f21695a, new itq(ire, bArr));
    }

    /* renamed from: a */
    public final void mo13272a(irh irh, Account account, String str, String str2, byte[] bArr, byte[] bArr2) {
        this.f21696b.mo16659a(this.f21695a, new its(irh, account, str, str2, bArr, bArr2));
    }

    /* renamed from: a */
    public final void mo13273a(irk irk, Account account, String str, String str2, byte[] bArr) {
        this.f21696b.mo16659a(this.f21695a, new itt(irk, account, str, str2, bArr));
    }

    /* renamed from: a */
    public final void mo13274a(irn irn, byte[] bArr) {
        this.f21696b.mo16659a(this.f21695a, new itu(irn, bArr));
    }

    /* renamed from: a */
    public final void mo13275a(irq irq, String str, Account account) {
        this.f21696b.mo16659a(this.f21695a, new itp(irq, str, account));
    }

    /* renamed from: a */
    public final void mo13276a(irt irt, int i, String str, Account account, List list) {
        this.f21696b.mo16659a(this.f21695a, new itv(irt, i, str, account, list));
    }

    /* renamed from: a */
    public final void mo13277a(irw irw, int i, String str, Account account, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f21696b.mo16659a(this.f21695a, new itx(irw, i, str, str, account, bArr, bArr2, bArr3));
    }

    /* renamed from: a */
    public final void mo13278a(irw irw, int i, List list, String str, Account account, List list2, byte[] bArr) {
        this.f21696b.mo16659a(this.f21695a, new ity(irw, i, list, str, account, list2, bArr));
    }

    /* renamed from: a */
    public final void mo13279a(irz irz, String str) {
        this.f21696b.mo16659a(this.f21695a, new iua(irz, str));
    }

    /* renamed from: a */
    public final void mo13280a(irz irz, String str, Account account) {
        this.f21696b.mo16659a(this.f21695a, new iub(irz, str, account));
    }

    /* renamed from: a */
    public final void mo13281a(isc isc, String str, Account account) {
        this.f21696b.mo16659a(this.f21695a, new iud(isc, str, account));
    }

    /* renamed from: a */
    public final void mo13282a(isf isf, String str, String str2, Account account, Payload payload) {
        this.f21696b.mo16659a(this.f21695a, new iuf(isf, str, str2, account, payload));
    }

    /* renamed from: a */
    public final void mo13283a(isi isi, String str, Account account, Payload payload) {
        this.f21696b.mo16659a(this.f21695a, new iuh(isi, str, account, payload));
    }

    /* renamed from: a */
    public final void mo13284a(isi isi, byte[] bArr, String str, byte[] bArr2) {
        this.f21696b.mo16659a(this.f21695a, new iug(isi, bArr, str, bArr2));
    }

    /* renamed from: a */
    public final void mo13285a(isl isl, String str, Account account, Payload payload) {
        this.f21696b.mo16659a(this.f21695a, new iuj(isl, str, account, payload));
    }

    /* renamed from: a */
    public final void mo13286a(isl isl, String str, byte[] bArr, Payload payload) {
        this.f21696b.mo16659a(this.f21695a, new iui(isl, str, bArr, payload));
    }

    /* renamed from: a */
    public final void mo13287a(rnt rnt, String str, Account account, int i, List list) {
        this.f21696b.mo16659a(this.f21695a, new iue(rnt, str, account, i, list));
    }

    /* renamed from: a */
    public final void mo13288a(rnt rnt, String str, Account account, int i, byte[] bArr, List list) {
        this.f21696b.mo16659a(this.f21695a, new itz(rnt, str, account, bArr, list));
    }
}
