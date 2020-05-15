package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.location.reporting.UploadRequest;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bgyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyg {

    /* renamed from: a */
    public static final Object f118028a = new Object();

    /* renamed from: b */
    public final Context f118029b;

    /* renamed from: c */
    public final SharedPreferences f118030c;

    /* renamed from: d */
    private final Random f118031d;

    public bgyg(Context context, SharedPreferences sharedPreferences, Random random) {
        int i;
        this.f118029b = context;
        this.f118030c = sharedPreferences;
        this.f118031d = random;
        synchronized (f118028a) {
            if (!this.f118030c.getAll().isEmpty()) {
                i = 0;
            } else {
                i = 3;
            }
            int i2 = this.f118030c.getInt("apiLevel", i);
            if (i2 < 2) {
                SharedPreferences.Editor edit = this.f118030c.edit();
                edit.remove("lastPosition");
                edit.remove("lastActivityProcessedMillis");
                edit.remove("locationReportingIntentTimestamp");
                edit.remove("locationReportsSinceLastWifiAttached");
                edit.apply();
            }
            if (i2 < 3) {
                mo63398a();
            }
            this.f118030c.edit().putInt("apiLevel", 3).apply();
        }
    }

    /* renamed from: a */
    public static bgyg m100351a(Context context) {
        bgzo.m100459a(context);
        spn.m35873c();
        return new bgyg(context, context.getSharedPreferences("LOCATION_REPORTING", 0), new Random());
    }

    /* renamed from: b */
    private static final String m100352b(Collection collection) {
        bxvd da = bgvn.f117695b.mo74144da();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bgyt bgyt = (bgyt) it.next();
            bxvd da2 = bgvo.f117698f.mo74144da();
            long j = bgyt.f118130a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bgvo bgvo = (bgvo) da2.f164949b;
            int i = bgvo.f117700a | 1;
            bgvo.f117700a = i;
            bgvo.f117701b = j;
            long j2 = bgyt.f118131b;
            bgvo.f117700a = i | 2;
            bgvo.f117702c = j2;
            UploadRequest uploadRequest = bgyt.f118132c;
            bxvd da3 = bgvw.f117757j.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bgvw bgvw = (bgvw) da3.f164949b;
            bgvw.f117759a |= 1;
            bgvw.f117760b = 1;
            Account account = uploadRequest.f79612a;
            if (account.name != null) {
                String str = account.name;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bgvw bgvw2 = (bgvw) da3.f164949b;
                str.getClass();
                bgvw2.f117759a = 2 | bgvw2.f117759a;
                bgvw2.f117761c = str;
            }
            if (account.type != null) {
                String str2 = account.type;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bgvw bgvw3 = (bgvw) da3.f164949b;
                str2.getClass();
                bgvw3.f117759a |= 4;
                bgvw3.f117762d = str2;
            }
            String str3 = uploadRequest.f79613b;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bgvw bgvw4 = (bgvw) da3.f164949b;
            str3.getClass();
            int i2 = bgvw4.f117759a | 8;
            bgvw4.f117759a = i2;
            bgvw4.f117763e = str3;
            long j3 = uploadRequest.f79614c;
            int i3 = i2 | 16;
            bgvw4.f117759a = i3;
            bgvw4.f117764f = j3;
            long j4 = uploadRequest.f79615d;
            int i4 = i3 | 32;
            bgvw4.f117759a = i4;
            bgvw4.f117765g = j4;
            long j5 = uploadRequest.f79616e;
            int i5 = i4 | 64;
            bgvw4.f117759a = i5;
            bgvw4.f117766h = j5;
            String str4 = uploadRequest.f79617f;
            if (str4 != null) {
                str4.getClass();
                bgvw4.f117759a = i5 | 128;
                bgvw4.f117767i = str4;
            }
            bgvw bgvw5 = (bgvw) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bgvo bgvo2 = (bgvo) da2.f164949b;
            bgvw5.getClass();
            bgvo2.f117703d = bgvw5;
            int i6 = bgvo2.f117700a | 4;
            bgvo2.f117700a = i6;
            String str5 = bgyt.f118133d;
            if (str5 != null) {
                str5.getClass();
                bgvo2.f117700a = i6 | 8;
                bgvo2.f117704e = str5;
            }
            bgvo bgvo3 = (bgvo) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bgvn bgvn = (bgvn) da.f164949b;
            bgvo3.getClass();
            if (!bgvn.f117697a.mo73666a()) {
                bgvn.f117697a = GeneratedMessageLite.m124021a(bgvn.f117697a);
            }
            bgvn.f117697a.add(bgvo3);
        }
        return Base64.encodeToString(((bgvn) da.mo74062i()).serializeToBytes(), 2);
    }

    /* renamed from: c */
    public final List mo63404c() {
        String string;
        String str;
        String str2;
        String str3;
        synchronized (f118028a) {
            string = this.f118030c.getString("uploadRequests", null);
        }
        if (string == null) {
            return Collections.emptyList();
        }
        try {
            byte[] decode = Base64.decode(string, 2);
            bxus c = bxus.m123744c();
            ArrayList arrayList = new ArrayList();
            for (bgvo bgvo : ((bgvn) GeneratedMessageLite.m124016a(bgvn.f117695b, decode, c)).f117697a) {
                bgvw bgvw = bgvo.f117703d;
                if (bgvw == null) {
                    bgvw = bgvw.f117757j;
                }
                int i = bgvw.f117759a;
                if ((i & 2) != 0) {
                    str = bgvw.f117761c;
                } else {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = bgvw.f117762d;
                } else {
                    str2 = null;
                }
                Account account = new Account(str, str2);
                String str4 = bgvw.f117763e;
                long j = bgvw.f117764f;
                long j2 = bgvw.f117765g;
                long j3 = bgvw.f117766h;
                if ((bgvw.f117759a & 128) != 0) {
                    str3 = bgvw.f117767i;
                } else {
                    str3 = null;
                }
                arrayList.add(new bgyt(bgvo.f117701b, bgvo.f117702c, new UploadRequest(account, str4, j, j2, j3, str3), bgvo.f117704e));
            }
            return Collections.unmodifiableList(arrayList);
        } catch (bxwf | RuntimeException e) {
            bgur.m100021b("GCoreUlr", string.length() == 0 ? new String("Can't parse upload request from: ") : "Can't parse upload request from: ".concat(string), e);
            this.f118030c.edit().remove("uploadRequests").apply();
            return Collections.emptyList();
        }
    }

    /* renamed from: d */
    public final boolean mo63405d() {
        return this.f118030c.getBoolean("lastDeepStillModeValue", false);
    }

    /* renamed from: e */
    public final String mo63406e() {
        return this.f118030c.getString("homePlaceId", null);
    }

    /* renamed from: f */
    public final String mo63407f() {
        return this.f118030c.getString("workPlaceId", null);
    }

    /* renamed from: a */
    public final bgyt mo63397a(UploadRequest uploadRequest, Long l, long j, String str) {
        bgyt bgyt;
        long j2 = uploadRequest.f79614c;
        long s = chcs.m148247s();
        if (j2 > s) {
            String valueOf = String.valueOf(uploadRequest);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
            sb.append(valueOf);
            sb.append(" duration too long; programming or deserialization error?");
            bgur.m100022b("GCoreUlr", new AssertionError(sb.toString()));
            j2 = s;
        }
        long j3 = j + j2;
        synchronized (f118028a) {
            ArrayList arrayList = new ArrayList(mo63404c());
            long j4 = l == null ? this.f118030c.getLong("uploadRequestId", 0) + 1 : l.longValue();
            bgyt = new bgyt(j4, j3, uploadRequest, str);
            arrayList.add(bgyt);
            this.f118030c.edit().putString("uploadRequests", m100352b(arrayList)).putLong("uploadRequestId", j4).apply();
        }
        return bgyt;
    }

    /* renamed from: a */
    public final void mo63398a() {
        SharedPreferences.Editor edit = this.f118030c.edit();
        edit.remove("uploadRequests");
        edit.apply();
    }

    /* renamed from: a */
    public final void mo63399a(long j) {
        this.f118030c.edit().putLong("lastInferredPlacesRefreshTime", j).apply();
    }

    /* renamed from: a */
    public final void mo63400a(String str) {
        if (str != null) {
            this.f118030c.edit().putString("homePlaceId", str).apply();
        }
    }

    /* renamed from: a */
    public final boolean mo63401a(Collection collection) {
        boolean removeAll;
        synchronized (f118028a) {
            C1225nr nrVar = new C1225nr();
            nrVar.addAll(mo63404c());
            removeAll = nrVar.removeAll(collection);
            this.f118030c.edit().putString("uploadRequests", m100352b(nrVar)).apply();
        }
        return removeAll;
    }

    /* renamed from: b */
    public final SecretKeySpec mo63402b() {
        long[] jArr;
        int i;
        synchronized (f118028a) {
            jArr = new long[4];
            int i2 = 0;
            while (true) {
                if (i2 >= 4) {
                    break;
                }
                StringBuilder sb = new StringBuilder(25);
                sb.append("encryptionKey_");
                sb.append(i2);
                String sb2 = sb.toString();
                if (!this.f118030c.contains(sb2)) {
                    jArr = null;
                    break;
                }
                jArr[i2] = this.f118030c.getLong(sb2, 0);
                i2++;
            }
            if (jArr == null) {
                SharedPreferences.Editor edit = this.f118030c.edit();
                long[] jArr2 = new long[4];
                for (int i3 = 0; i3 < 4; i3++) {
                    StringBuilder sb3 = new StringBuilder(25);
                    sb3.append("encryptionKey_");
                    sb3.append(i3);
                    String sb4 = sb3.toString();
                    long nextLong = this.f118031d.nextLong();
                    jArr2[i3] = nextLong;
                    edit.putLong(sb4, nextLong);
                }
                edit.apply();
                jArr = jArr2;
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(32);
        for (i = 0; i < 4; i++) {
            allocate.putLong(jArr[i]);
        }
        return new SecretKeySpec(allocate.array(), "AES");
    }

    /* renamed from: b */
    public final void mo63403b(String str) {
        if (str != null) {
            this.f118030c.edit().putString("workPlaceId", str).apply();
        }
    }
}
