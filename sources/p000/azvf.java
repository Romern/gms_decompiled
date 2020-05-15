package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: azvf */
final /* synthetic */ class azvf implements azrh {

    /* renamed from: a */
    private final azvv f100079a;

    /* renamed from: b */
    private final int f100080b;

    /* renamed from: c */
    private final bctq[] f100081c;

    public azvf(azvv azvv, int i, bctq[] bctqArr) {
        this.f100079a = azvv;
        this.f100080b = i;
        this.f100081c = bctqArr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbpk.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, java.lang.Integer, java.lang.Integer, bctq[]):bdar
     arg types: [bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, java.lang.Integer, int, bctq[]]
     candidates:
      bbpk.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, bcop, java.lang.String, bmxv):bqgg
      bbpk.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, java.lang.Integer, java.lang.Integer, bctq[]):bdar */
    /* renamed from: a */
    public final Object mo55247a(bcoh bcoh, Object obj) {
        azvv azvv = this.f100079a;
        int i = this.f100080b;
        bctq[] bctqArr = this.f100081c;
        return azvv.f100098c.mo56312a(bcoh, (ConversationId) obj, Integer.valueOf(i), (Integer) 0, bctqArr);
    }
}
