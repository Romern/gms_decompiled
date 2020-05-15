package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;

/* renamed from: bcte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcte {

    /* renamed from: a */
    public int f104841a;

    /* renamed from: b */
    private String f104842b;

    /* renamed from: c */
    private ContactId f104843c;

    /* renamed from: d */
    private ConversationId f104844d;

    /* renamed from: e */
    private Long f104845e;

    /* renamed from: f */
    private bmxv f104846f;

    /* renamed from: g */
    private bcti f104847g;

    /* renamed from: h */
    private bctk f104848h;

    /* renamed from: i */
    private bmxv f104849i;

    /* renamed from: j */
    private bnhe f104850j;

    /* renamed from: k */
    private Integer f104851k;

    /* renamed from: l */
    private bcto f104852l;

    /* renamed from: m */
    private Integer f104853m;

    /* renamed from: n */
    private Integer f104854n;

    public bcte() {
    }

    /* renamed from: a */
    public final bctr mo57502a() {
        String str = this.f104842b == null ? " messageId" : "";
        if (this.f104841a == 0) {
            str = str.concat(" messageType");
        }
        if (this.f104843c == null) {
            str = String.valueOf(str).concat(" sender");
        }
        if (this.f104844d == null) {
            str = String.valueOf(str).concat(" conversationId");
        }
        if (this.f104845e == null) {
            str = String.valueOf(str).concat(" serverTimestampUs");
        }
        if (this.f104847g == null) {
            str = String.valueOf(str).concat(" messageContent");
        }
        if (this.f104848h == null) {
            str = String.valueOf(str).concat(" messageStatus");
        }
        if (this.f104850j == null) {
            str = String.valueOf(str).concat(" metadata");
        }
        if (this.f104851k == null) {
            str = String.valueOf(str).concat(" capability");
        }
        if (this.f104852l == null) {
            str = String.valueOf(str).concat(" renderingDetails");
        }
        if (this.f104853m == null) {
            str = String.valueOf(str).concat(" intendedRenderingType");
        }
        if (this.f104854n == null) {
            str = String.valueOf(str).concat(" filterableFlags");
        }
        if (str.isEmpty()) {
            return new bcrt(this.f104842b, this.f104841a, this.f104843c, this.f104844d, this.f104845e, this.f104846f, this.f104847g, this.f104848h, this.f104849i, this.f104850j, this.f104851k.intValue(), this.f104852l, this.f104853m.intValue(), this.f104854n.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57515b() {
        mo57505a(bcpu.f104666a);
    }

    /* renamed from: c */
    public final void mo57518c() {
        mo57507a(bcqb.f104671a);
    }

    /* renamed from: d */
    public final void mo57521d(String str) {
        this.f104849i = bmxv.m108566b(str);
    }

    /* renamed from: b */
    public final void mo57516b(int i) {
        this.f104854n = Integer.valueOf(i);
    }

    /* renamed from: c */
    public final void mo57519c(int i) {
        this.f104853m = Integer.valueOf(i);
    }

    public bcte(bctr bctr) {
        this.f104846f = bmvz.f131120a;
        this.f104849i = bmvz.f131120a;
        bcrt bcrt = (bcrt) bctr;
        this.f104842b = bcrt.f104743a;
        this.f104841a = bcrt.f104756n;
        this.f104843c = bcrt.f104744b;
        this.f104844d = bcrt.f104745c;
        this.f104845e = bcrt.f104746d;
        this.f104846f = bcrt.f104747e;
        this.f104847g = bcrt.f104748f;
        this.f104848h = bcrt.f104749g;
        this.f104849i = bcrt.f104750h;
        this.f104850j = bcrt.f104751i;
        this.f104851k = Integer.valueOf(bcrt.f104752j);
        this.f104852l = bcrt.f104753k;
        this.f104853m = Integer.valueOf(bcrt.f104754l);
        this.f104854n = Integer.valueOf(bcrt.f104755m);
    }

    /* renamed from: c */
    public final void mo57520c(String str) {
        if (str != null) {
            this.f104842b = str;
            return;
        }
        throw new NullPointerException("Null messageId");
    }

    /* renamed from: b */
    public final void mo57517b(String str) {
        mo57505a(bcqa.m89619a(str));
    }

    public bcte(byte[] bArr) {
        this.f104846f = bmvz.f131120a;
        this.f104849i = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo57503a(int i) {
        this.f104851k = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57504a(bcth bcth) {
        mo57505a(bcqa.m89616a(bcth));
    }

    /* renamed from: a */
    public final void mo57505a(bcti bcti) {
        if (bcti != null) {
            this.f104847g = bcti;
            return;
        }
        throw new NullPointerException("Null messageContent");
    }

    /* renamed from: a */
    public final void mo57506a(bctk bctk) {
        if (bctk != null) {
            this.f104848h = bctk;
            return;
        }
        throw new NullPointerException("Null messageStatus");
    }

    /* renamed from: a */
    public final void mo57507a(bcto bcto) {
        if (bcto != null) {
            this.f104852l = bcto;
            return;
        }
        throw new NullPointerException("Null renderingDetails");
    }

    /* renamed from: a */
    public final void mo57508a(bcuo bcuo) {
        mo57505a(bcqa.m89617a(bcuo));
    }

    /* renamed from: a */
    public final void mo57509a(bxtx bxtx) {
        mo57505a(bcqa.m89618a(bxtx));
    }

    /* renamed from: a */
    public final void mo57510a(ContactId contactId) {
        if (contactId != null) {
            this.f104843c = contactId;
            return;
        }
        throw new NullPointerException("Null sender");
    }

    /* renamed from: a */
    public final void mo57511a(ConversationId conversationId) {
        if (conversationId != null) {
            this.f104844d = conversationId;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    /* renamed from: a */
    public final void mo57512a(Long l) {
        if (l != null) {
            this.f104845e = l;
            return;
        }
        throw new NullPointerException("Null serverTimestampUs");
    }

    /* renamed from: a */
    public final void mo57513a(String str) {
        this.f104846f = bmxv.m108566b(str);
    }

    /* renamed from: a */
    public final void mo57514a(Map map) {
        this.f104850j = bnhe.m109413a(map);
    }
}
