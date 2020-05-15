package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;

/* renamed from: bcso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcso {

    /* renamed from: a */
    public Long f104811a;

    /* renamed from: b */
    public bmxv f104812b;

    /* renamed from: c */
    private ConversationId f104813c;

    /* renamed from: d */
    private bmxv f104814d;

    /* renamed from: e */
    private bmxv f104815e;

    /* renamed from: f */
    private bmxv f104816f;

    /* renamed from: g */
    private Boolean f104817g;

    /* renamed from: h */
    private Long f104818h;

    /* renamed from: i */
    private Boolean f104819i;

    /* renamed from: j */
    private Map f104820j;

    /* renamed from: k */
    private bngx f104821k;

    /* renamed from: l */
    private Long f104822l;

    public bcso() {
    }

    /* renamed from: a */
    public final bcsp mo57457a() {
        String str = this.f104813c == null ? " conversationId" : "";
        if (this.f104817g == null) {
            str = str.concat(" isImageStale");
        }
        if (this.f104818h == null) {
            str = String.valueOf(str).concat(" expirationTimeMillis");
        }
        if (this.f104811a == null) {
            str = String.valueOf(str).concat(" lastDeletedTimeMillis");
        }
        if (this.f104819i == null) {
            str = String.valueOf(str).concat(" blockable");
        }
        if (this.f104820j == null) {
            str = String.valueOf(str).concat(" appData");
        }
        if (this.f104821k == null) {
            str = String.valueOf(str).concat(" capabilities");
        }
        if (this.f104822l == null) {
            str = String.valueOf(str).concat(" propertiesExpirationTimeMillis");
        }
        if (str.isEmpty()) {
            return new bcrm(this.f104813c, this.f104814d, this.f104815e, this.f104816f, this.f104817g.booleanValue(), this.f104818h, this.f104811a, this.f104819i.booleanValue(), this.f104820j, this.f104812b, this.f104821k, this.f104822l);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57466b(Long l) {
        if (l != null) {
            this.f104822l = l;
            return;
        }
        throw new NullPointerException("Null propertiesExpirationTimeMillis");
    }

    /* renamed from: b */
    public final void mo57467b(String str) {
        this.f104814d = bmxv.m108566b(str);
    }

    public bcso(bcsp bcsp) {
        this.f104814d = bmvz.f131120a;
        this.f104815e = bmvz.f131120a;
        this.f104816f = bmvz.f131120a;
        this.f104812b = bmvz.f131120a;
        bcrm bcrm = (bcrm) bcsp;
        this.f104813c = bcrm.f104719a;
        this.f104814d = bcrm.f104720b;
        this.f104815e = bcrm.f104721c;
        this.f104816f = bcrm.f104722d;
        this.f104817g = Boolean.valueOf(bcrm.f104723e);
        this.f104818h = bcrm.f104724f;
        this.f104811a = bcrm.f104725g;
        this.f104819i = Boolean.valueOf(bcrm.f104726h);
        this.f104820j = bcrm.f104727i;
        this.f104812b = bcrm.f104728j;
        this.f104821k = bcrm.f104729k;
        this.f104822l = bcrm.f104730l;
    }

    /* renamed from: b */
    public final void mo57468b(boolean z) {
        this.f104817g = Boolean.valueOf(z);
    }

    public bcso(byte[] bArr) {
        this.f104814d = bmvz.f131120a;
        this.f104815e = bmvz.f131120a;
        this.f104816f = bmvz.f131120a;
        this.f104812b = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo57458a(Bitmap bitmap) {
        this.f104816f = bmxv.m108566b(bitmap);
    }

    /* renamed from: a */
    public final void mo57459a(bcsq bcsq) {
        mo57461a(bcsq.mo57472a());
    }

    /* renamed from: a */
    public final void mo57460a(bngx bngx) {
        if (bngx != null) {
            this.f104821k = bngx;
            return;
        }
        throw new NullPointerException("Null capabilities");
    }

    /* renamed from: a */
    public final void mo57461a(ConversationId conversationId) {
        if (conversationId != null) {
            this.f104813c = conversationId;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    /* renamed from: a */
    public final void mo57462a(Long l) {
        if (l != null) {
            this.f104818h = l;
            return;
        }
        throw new NullPointerException("Null expirationTimeMillis");
    }

    /* renamed from: a */
    public final void mo57463a(String str) {
        this.f104815e = bmxv.m108566b(str);
    }

    /* renamed from: a */
    public final void mo57464a(Map map) {
        if (map != null) {
            this.f104820j = map;
            return;
        }
        throw new NullPointerException("Null appData");
    }

    /* renamed from: a */
    public final void mo57465a(boolean z) {
        this.f104819i = Boolean.valueOf(z);
    }
}
