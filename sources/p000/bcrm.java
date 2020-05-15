package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;

/* renamed from: bcrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrm extends bcsp {

    /* renamed from: a */
    public final ConversationId f104719a;

    /* renamed from: b */
    public final bmxv f104720b;

    /* renamed from: c */
    public final bmxv f104721c;

    /* renamed from: d */
    public final bmxv f104722d;

    /* renamed from: e */
    public final boolean f104723e;

    /* renamed from: f */
    public final Long f104724f;

    /* renamed from: g */
    public final Long f104725g;

    /* renamed from: h */
    public final boolean f104726h;

    /* renamed from: i */
    public final Map f104727i;

    /* renamed from: j */
    public final bmxv f104728j;

    /* renamed from: k */
    public final bngx f104729k;

    /* renamed from: l */
    public final Long f104730l;

    public bcrm(ConversationId conversationId, bmxv bmxv, bmxv bmxv2, bmxv bmxv3, boolean z, Long l, Long l2, boolean z2, Map map, bmxv bmxv4, bngx bngx, Long l3) {
        this.f104719a = conversationId;
        this.f104720b = bmxv;
        this.f104721c = bmxv2;
        this.f104722d = bmxv3;
        this.f104723e = z;
        this.f104724f = l;
        this.f104725g = l2;
        this.f104726h = z2;
        this.f104727i = map;
        this.f104728j = bmxv4;
        this.f104729k = bngx;
        this.f104730l = l3;
    }

    /* renamed from: a */
    public final ConversationId mo57317a() {
        return this.f104719a;
    }

    /* renamed from: b */
    public final bmxv mo57318b() {
        return this.f104720b;
    }

    /* renamed from: c */
    public final bmxv mo57319c() {
        return this.f104721c;
    }

    /* renamed from: d */
    public final bmxv mo57320d() {
        return this.f104722d;
    }

    /* renamed from: e */
    public final boolean mo57321e() {
        return this.f104723e;
    }

    /* renamed from: f */
    public final Long mo57322f() {
        return this.f104724f;
    }

    /* renamed from: g */
    public final Long mo57323g() {
        return this.f104725g;
    }

    /* renamed from: h */
    public final boolean mo57324h() {
        return this.f104726h;
    }

    /* renamed from: i */
    public final Map mo57325i() {
        return this.f104727i;
    }

    /* renamed from: j */
    public final bmxv mo57326j() {
        return this.f104728j;
    }

    /* renamed from: k */
    public final bngx mo57327k() {
        return this.f104729k;
    }

    /* renamed from: l */
    public final Long mo57328l() {
        return this.f104730l;
    }

    /* renamed from: m */
    public final bcso mo57329m() {
        return new bcso(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104719a);
        String valueOf2 = String.valueOf(this.f104720b);
        String valueOf3 = String.valueOf(this.f104721c);
        String valueOf4 = String.valueOf(this.f104722d);
        boolean z = this.f104723e;
        String valueOf5 = String.valueOf(this.f104724f);
        String valueOf6 = String.valueOf(this.f104725g);
        boolean z2 = this.f104726h;
        String valueOf7 = String.valueOf(this.f104727i);
        String valueOf8 = String.valueOf(this.f104728j);
        String valueOf9 = String.valueOf(this.f104729k);
        String valueOf10 = String.valueOf(this.f104730l);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        StringBuilder sb = new StringBuilder(length + BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf10).length());
        sb.append("Conversation{conversationId=");
        sb.append(valueOf);
        sb.append(", title=");
        sb.append(valueOf2);
        sb.append(", imageUrl=");
        sb.append(valueOf3);
        sb.append(", image=");
        sb.append(valueOf4);
        sb.append(", isImageStale=");
        sb.append(z);
        sb.append(", expirationTimeMillis=");
        sb.append(valueOf5);
        sb.append(", lastDeletedTimeMillis=");
        sb.append(valueOf6);
        sb.append(", blockable=");
        sb.append(z2);
        sb.append(", appData=");
        sb.append(valueOf7);
        sb.append(", suggestionList=");
        sb.append(valueOf8);
        sb.append(", capabilities=");
        sb.append(valueOf9);
        sb.append(", propertiesExpirationTimeMillis=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }
}
