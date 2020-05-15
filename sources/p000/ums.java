package p000;

import android.content.ContentValues;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: ums */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ums extends uny {

    /* renamed from: f */
    public static final /* synthetic */ int f48251f = 0;

    /* renamed from: a */
    public final ukk f48252a;

    /* renamed from: b */
    public final long f48253b;

    /* renamed from: c */
    public final int f48254c;

    /* renamed from: d */
    public long f48255d;

    /* renamed from: e */
    public String f48256e;

    public ums(uno uno, long j, ukk ukk, String str, long j2, int i, long j3) {
        super(uno, umv.f48267a, j);
        this.f48252a = ukk;
        this.f48253b = j2;
        this.f48254c = i;
        this.f48255d = j3;
        this.f48256e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27511a(ContentValues contentValues) {
        Long l;
        ukk ukk = this.f48252a;
        if (ukk != null) {
            l = Long.valueOf(ukk.f47941a);
        } else {
            l = null;
        }
        contentValues.put(umu.ENTRY_ID.f48266i.mo27700a(), l);
        contentValues.put(umu.EVENT_TYPE.f48266i.mo27700a(), Integer.valueOf(this.f48254c));
        contentValues.put(umu.LAST_UPDATE_TIME.f48266i.mo27700a(), Long.valueOf(this.f48255d));
        contentValues.put(umu.ANDROID_APP_ID.f48266i.mo27700a(), Long.valueOf(this.f48253b));
        contentValues.put(umu.SERIALIZED_SUBSCRIPTION_DETAILS.f48266i.mo27700a(), this.f48256e);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f48252a);
        long j = this.f48253b;
        int i = this.f48254c;
        long j2 = this.f48255d;
        String str = this.f48256e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + MfiClientException.TYPE_ILLEGAL_CARD_OPERATION + String.valueOf(str).length());
        sb.append("Subscription [entrySpec=");
        sb.append(valueOf);
        sb.append(", androidAppSqlId= ");
        sb.append(j);
        sb.append(", eventType=");
        sb.append(i);
        sb.append(", lastUpdateTime =");
        sb.append(j2);
        sb.append(", serializedSubscriptionDetails =");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public ums(uno uno, ukk ukk, String str, long j, int i, long j2) {
        this(uno, -1, ukk, str, j, i, j2);
    }
}
