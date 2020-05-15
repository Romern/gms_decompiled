package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcnr {

    /* renamed from: a */
    public bmxv f104572a;

    /* renamed from: b */
    private Integer f104573b;

    /* renamed from: c */
    private bmxv f104574c;

    /* renamed from: d */
    private bmxv f104575d;

    /* renamed from: e */
    private bmxv f104576e;

    /* renamed from: f */
    private bmxv f104577f;

    /* renamed from: g */
    private bmxv f104578g;

    /* renamed from: h */
    private bmxv f104579h;

    /* renamed from: i */
    private bmxv f104580i;

    /* renamed from: j */
    private bmxv f104581j;

    /* renamed from: k */
    private bmxv f104582k;

    /* renamed from: l */
    private bmxv f104583l;

    /* renamed from: m */
    private bngx f104584m;

    /* renamed from: n */
    private bmxv f104585n;

    /* renamed from: o */
    private bmxv f104586o;

    /* renamed from: p */
    private bmxv f104587p;

    public bcnr() {
    }

    /* renamed from: a */
    public final bcns mo57002a() {
        String str = this.f104573b == null ? " eventType" : "";
        if (this.f104584m == null) {
            str = str.concat(" experimentIds");
        }
        if (str.isEmpty()) {
            return new bcnq(this.f104573b.intValue(), this.f104574c, this.f104575d, this.f104576e, this.f104577f, this.f104578g, this.f104579h, this.f104580i, this.f104581j, this.f104582k, this.f104583l, this.f104584m, this.f104585n, this.f104586o, this.f104587p, this.f104572a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57011b(int i) {
        this.f104573b = Integer.valueOf(i);
    }

    /* renamed from: c */
    public final void mo57014c(int i) {
        this.f104579h = bmxv.m108566b(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final void mo57015d(int i) {
        this.f104582k = bmxv.m108566b(Integer.valueOf(i));
    }

    /* renamed from: e */
    public final void mo57016e(int i) {
        this.f104583l = bmxv.m108566b(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo57012b(ContactId contactId) {
        this.f104574c = bmxv.m108566b(contactId);
    }

    public bcnr(byte[] bArr) {
        this.f104574c = bmvz.f131120a;
        this.f104575d = bmvz.f131120a;
        this.f104576e = bmvz.f131120a;
        this.f104577f = bmvz.f131120a;
        this.f104578g = bmvz.f131120a;
        this.f104579h = bmvz.f131120a;
        this.f104580i = bmvz.f131120a;
        this.f104581j = bmvz.f131120a;
        this.f104582k = bmvz.f131120a;
        this.f104583l = bmvz.f131120a;
        this.f104585n = bmvz.f131120a;
        this.f104586o = bmvz.f131120a;
        this.f104587p = bmvz.f131120a;
        this.f104572a = bmvz.f131120a;
    }

    /* renamed from: b */
    public final void mo57013b(String str) {
        this.f104576e = bmxv.m108566b(str);
    }

    /* renamed from: a */
    public final void mo57003a(int i) {
        this.f104580i = bmxv.m108566b(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo57004a(long j) {
        this.f104587p = bmxv.m108566b(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo57005a(bcux bcux) {
        this.f104585n = bmxv.m108566b(bcux);
    }

    /* renamed from: a */
    public final void mo57006a(bngx bngx) {
        if (bngx != null) {
            this.f104584m = bngx;
            return;
        }
        throw new NullPointerException("Null experimentIds");
    }

    /* renamed from: a */
    public final void mo57007a(ContactId contactId) {
        this.f104577f = bmxv.m108566b(contactId);
    }

    /* renamed from: a */
    public final void mo57008a(ConversationId conversationId) {
        this.f104578g = bmxv.m108566b(conversationId);
    }

    /* renamed from: a */
    public final void mo57009a(Integer num) {
        this.f104581j = bmxv.m108566b(num);
    }

    /* renamed from: a */
    public final void mo57010a(String str) {
        this.f104575d = bmxv.m108566b(str);
    }
}
