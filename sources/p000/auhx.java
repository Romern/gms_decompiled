package p000;

import android.content.ContentUris;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.provider.Telephony;
import android.util.Log;
import java.util.Arrays;

/* renamed from: auhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auhx extends adzx {

    /* renamed from: a */
    final /* synthetic */ auhy f91851a;

    /* renamed from: b */
    private final String[] f91852b = {"", ""};

    /* renamed from: c */
    private int f91853c = 0;

    /* renamed from: d */
    private final long[] f91854d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(long[], long):void}
     arg types: [long[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(long[], long):void} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public auhx(auhy auhy, Handler handler) {
        super("thunderbird", "SmsContentObserver", handler);
        this.f91851a = auhy;
        long[] jArr = new long[5];
        this.f91854d = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        Cursor query;
        if (uri != null) {
            C1223np npVar = auho.f91828a;
            try {
                long parseId = ContentUris.parseId(uri);
                long[] jArr = this.f91854d;
                int length = jArr.length;
                int i = 0;
                while (i < length) {
                    if (parseId != jArr[i]) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f91852b[0] = Long.toString(parseId);
                this.f91852b[1] = Long.toString(System.currentTimeMillis() - 15000);
                try {
                    auhy auhy = this.f91851a;
                    String[] strArr = auhy.f91855a;
                    query = auhy.f91856b.getContentResolver().query(Telephony.Sms.Sent.CONTENT_URI, auhy.f91855a, "_id=? AND date>? AND type=2", this.f91852b, "date ASC");
                    if (query != null) {
                        if (query.moveToFirst()) {
                            if (auho.m77070a()) {
                                String valueOf = String.valueOf(uri);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                                sb.append("new sent sms event: ");
                                sb.append(valueOf);
                                Log.d("Thunderbird", sb.toString());
                            }
                            long[] jArr2 = this.f91854d;
                            int i2 = this.f91853c;
                            jArr2[i2] = parseId;
                            this.f91853c = (i2 + 1) % jArr2.length;
                            this.f91851a.f91858d.mo50545a(query.getString(query.getColumnIndex("address")));
                        }
                    }
                    if (query != null) {
                        query.close();
                        return;
                    }
                    return;
                } catch (SecurityException e) {
                    if (auho.m77070a()) {
                        Log.d("Thunderbird", "cannot query sms - lost permission", e);
                        return;
                    }
                    return;
                } catch (SQLiteException e2) {
                    Log.w("Thunderbird", "error checking for sent sms", e2);
                    return;
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            } catch (NumberFormatException e3) {
                return;
            }
        } else {
            return;
        }
        throw th;
    }
}
