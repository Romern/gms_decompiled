package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: bcsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcsi {

    /* renamed from: a */
    public bmxv f104793a;

    /* renamed from: b */
    private ContactId f104794b;

    /* renamed from: c */
    private bmxv f104795c;

    /* renamed from: d */
    private bmxv f104796d;

    /* renamed from: e */
    private bmxv f104797e;

    /* renamed from: f */
    private Boolean f104798f;

    /* renamed from: g */
    private Long f104799g;

    /* renamed from: h */
    private bngx f104800h;

    /* renamed from: i */
    private bngx f104801i;

    /* renamed from: j */
    private bmxv f104802j;

    /* renamed from: k */
    private bmxv f104803k;

    public bcsi() {
    }

    /* renamed from: a */
    public final bcsj mo57436a() {
        String str = this.f104794b == null ? " contactId" : "";
        if (this.f104798f == null) {
            str = str.concat(" isImageStale");
        }
        if (this.f104799g == null) {
            str = String.valueOf(str).concat(" expirationTimeMillis");
        }
        if (this.f104800h == null) {
            str = String.valueOf(str).concat(" menuItems");
        }
        if (this.f104801i == null) {
            str = String.valueOf(str).concat(" toolbarButtons");
        }
        if (str.isEmpty()) {
            return new bcrk(this.f104794b, this.f104795c, this.f104793a, this.f104796d, this.f104797e, this.f104798f.booleanValue(), this.f104799g, this.f104800h, this.f104801i, this.f104802j, this.f104803k);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57445b(bngx bngx) {
        if (bngx != null) {
            this.f104801i = bngx;
            return;
        }
        throw new NullPointerException("Null toolbarButtons");
    }

    /* renamed from: b */
    public final void mo57446b(String str) {
        this.f104795c = bmxv.m108566b(str);
    }

    public bcsi(bcsj bcsj) {
        this.f104795c = bmvz.f131120a;
        this.f104793a = bmvz.f131120a;
        this.f104796d = bmvz.f131120a;
        this.f104797e = bmvz.f131120a;
        this.f104802j = bmvz.f131120a;
        this.f104803k = bmvz.f131120a;
        bcrk bcrk = (bcrk) bcsj;
        this.f104794b = bcrk.f104708a;
        this.f104795c = bcrk.f104709b;
        this.f104793a = bcrk.f104710c;
        this.f104796d = bcrk.f104711d;
        this.f104797e = bcrk.f104712e;
        this.f104798f = Boolean.valueOf(bcrk.f104713f);
        this.f104799g = bcrk.f104714g;
        this.f104800h = bcrk.f104715h;
        this.f104801i = bcrk.f104716i;
        this.f104802j = bcrk.f104717j;
        this.f104803k = bcrk.f104718k;
    }

    public bcsi(byte[] bArr) {
        this.f104795c = bmvz.f131120a;
        this.f104793a = bmvz.f131120a;
        this.f104796d = bmvz.f131120a;
        this.f104797e = bmvz.f131120a;
        this.f104802j = bmvz.f131120a;
        this.f104803k = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo57437a(Bitmap bitmap) {
        this.f104797e = bmxv.m108566b(bitmap);
    }

    /* renamed from: a */
    public final void mo57438a(bcsv bcsv) {
        this.f104802j = bmxv.m108566b(bcsv);
    }

    /* renamed from: a */
    public final void mo57439a(bctd bctd) {
        this.f104803k = bmxv.m108566b(bctd);
    }

    /* renamed from: a */
    public final void mo57440a(bngx bngx) {
        if (bngx != null) {
            this.f104800h = bngx;
            return;
        }
        throw new NullPointerException("Null menuItems");
    }

    /* renamed from: a */
    public final void mo57441a(ContactId contactId) {
        if (contactId != null) {
            this.f104794b = contactId;
            return;
        }
        throw new NullPointerException("Null contactId");
    }

    /* renamed from: a */
    public final void mo57442a(Long l) {
        if (l != null) {
            this.f104799g = l;
            return;
        }
        throw new NullPointerException("Null expirationTimeMillis");
    }

    /* renamed from: a */
    public final void mo57443a(String str) {
        this.f104796d = bmxv.m108566b(str);
    }

    /* renamed from: a */
    public final void mo57444a(boolean z) {
        this.f104798f = Boolean.valueOf(z);
    }
}
