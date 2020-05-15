package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: acoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acoo extends acny {

    /* renamed from: d */
    final /* synthetic */ acoq f60353d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acoo(acoq acoq, long j, int i) {
        super(j, i);
        this.f60353d = acoq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Cursor mo32939b() {
        acnv.m49555d("Processing MMS messages newer than date: %d", Long.valueOf(((acny) this).f60305a));
        String valueOf = String.valueOf(((acny) this).f60305a);
        return this.f60353d.f60367k.mo32907a(acok.f60337b, acoq.f60361e, acoq.f60365i, new String[]{valueOf, valueOf, String.valueOf(((acny) this).f60306b), String.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() + acoq.f60357a))}, "date,_id LIMIT 1000");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer
     arg types: [android.database.Cursor, int, int]
     candidates:
      sra.a(android.database.Cursor, int, java.lang.Long):java.lang.Long
      sra.a(android.database.Cursor, int, java.lang.String):java.lang.String
      sra.a(android.content.ContentValues, java.lang.String, java.lang.Integer):void
      sra.a(android.content.ContentValues, java.lang.String, java.lang.String):void
      sra.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[]):void
      sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0139, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        p000.acnv.m49557e("No permission to read phone number: %s", r0);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01bb, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01bc, code lost:
        if (r6 != null) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c7, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:30:0x0120, B:34:0x0130] */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo32940c() {
        Long b;
        Cursor a;
        Throwable th;
        String str;
        Throwable th2;
        try {
            boolean z = false;
            Integer a2 = sra.m36060a(this.f60307c, 0);
            if (!(a2 == null || (b = sra.m36068b(this.f60307c, 3)) == null)) {
                ((acny) this).f60306b = a2.intValue();
                ((acny) this).f60305a = b.longValue();
                int i = ((acny) this).f60306b;
                StringBuilder sb = new StringBuilder(25);
                sb.append("content://mms/");
                sb.append(i);
                String sb2 = sb.toString();
                acoq acoq = this.f60353d;
                int i2 = ((acny) this).f60306b;
                acop acop = new acop();
                Uri withAppendedPath = Uri.withAppendedPath(acok.f60337b, "part");
                acne acne = acoq.f60367k;
                String[] strArr = acoq.f60363g;
                StringBuilder sb3 = new StringBuilder(15);
                sb3.append("mid=");
                sb3.append(i2);
                a = acne.mo32907a(withAppendedPath, strArr, sb3.toString(), null, null);
                if (a != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    while (a.moveToNext()) {
                        String c = sra.m36069c(a, 0);
                        String c2 = sra.m36069c(a, 1);
                        if (acoq.f60359c.contains(c2)) {
                            if (!"text/plain".equals(c2)) {
                                arrayList.add(Uri.withAppendedPath(withAppendedPath, c));
                            } else {
                                acop.f60354a = sra.m36069c(a, 2);
                            }
                            arrayList2.add(c2.replace('/', '_'));
                        }
                    }
                    acop.f60355b = TextUtils.join(",", arrayList);
                    acop.f60356c = TextUtils.join(",", arrayList2);
                    a.close();
                } else {
                    acnv.m49557e("Couldn't find MMS part for %d", Integer.valueOf(i2));
                }
                acnw n = acnx.m49565n();
                n.mo32933a(((acny) this).f60306b);
                n.f60292a = "mms";
                n.mo32938b(sb2);
                n.f60293b = sra.m36060a(this.f60307c, 1);
                n.f60294c = sra.m36060a(this.f60307c, 2);
                acoq acoq2 = this.f60353d;
                int intValue = a2.intValue();
                Uri.Builder buildUpon = acok.f60337b.buildUpon();
                buildUpon.appendPath(String.valueOf(intValue)).appendPath("addr");
                Uri build = buildUpon.build();
                StringBuilder sb4 = new StringBuilder();
                Cursor a3 = acoq2.f60367k.mo32907a(build, acoq.f60362f, null, null, "type ASC");
                if (a3 == null) {
                    acnv.m49557e("Couldn't find MMS part for %d", Integer.valueOf(intValue));
                } else {
                    Context context = acoq2.f60366j;
                    TelephonyManager a4 = acob.m49585a(context);
                    if (a4 != null) {
                        str = acob.m49586a(context, a4.getLine1Number());
                    } else {
                        str = null;
                    }
                    while (a3.moveToNext()) {
                        String a5 = acob.m49586a(acoq2.f60366j, sra.m36069c(a3, 1));
                        if (!TextUtils.isEmpty(a5) && !a5.equals(str)) {
                            if (sb4.length() != 0) {
                                sb4.append(",");
                            }
                            sb4.append(a5);
                        }
                    }
                }
                if (a3 != null) {
                    a3.close();
                }
                n.f60295d = sb4.toString();
                n.mo32934a(TimeUnit.SECONDS.toMillis(((acny) this).f60305a));
                n.f60296e = sra.m36069c(this.f60307c, 4);
                n.f60297f = acop.f60354a;
                n.mo32937b((int) ((acny) this).f60305a);
                n.mo32935a(acop.f60356c);
                n.f60298g = acop.f60355b;
                if (sra.m36061a(this.f60307c, 5, (Integer) 0).intValue() != 0) {
                    z = true;
                }
                n.mo32936a(z);
                return n.mo32932a();
            }
        } catch (SQLiteException e) {
        } catch (Throwable th3) {
            bqye.m113761a(th2, th3);
        }
        return null;
        throw th2;
    }
}
