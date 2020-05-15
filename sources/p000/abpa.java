package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Matcher;

/* renamed from: abpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpa extends dck implements abpb {

    /* renamed from: a */
    private final Context f57828a;

    /* renamed from: b */
    private final aaol f57829b;

    public abpa() {
        super("com.google.android.gms.http.IGoogleHttpService");
    }

    /* renamed from: a */
    private final void m48029a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid != Process.myUid() && !rfz.m33557a(this.f57828a).mo24608b(callingUid)) {
            throw new SecurityException("Uid is not Google Signed");
        }
    }

    /* renamed from: a */
    public final Bundle mo32274a(String str) {
        aaom aaom;
        String str2;
        String a;
        m48029a();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            aaoo a2 = aaoo.m21765a(this.f57828a);
            Matcher matcher = a2.f28710c.matcher(str);
            int i = 0;
            if (matcher.lookingAt()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= a2.f28709b.length) {
                        break;
                    }
                    int i3 = i2 + 1;
                    if (matcher.group(i3) != null) {
                        aaom = a2.f28709b[i2];
                        break;
                    }
                    i2 = i3;
                }
            }
            aaom = aaom.f28701d;
            Bundle bundle = null;
            if (!aaom.f28704c) {
                String str3 = aaom.f28703b;
                if (str3 != null) {
                    String valueOf = String.valueOf(str.substring(aaom.f28702a.length()));
                    str2 = valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf);
                } else {
                    str2 = str;
                }
            } else {
                str2 = null;
            }
            if (!TextUtils.equals(str2, str)) {
                bundle = new Bundle();
                if (str2 == null) {
                    bundle.putString("block", "1");
                } else {
                    bundle.putString("rewrite", str2);
                }
            }
            if (bundle == null || !bundle.containsKey("block")) {
                if (bundle != null) {
                    if (bundle.containsKey("rewrite")) {
                        str = bundle.getString("rewrite");
                    }
                }
                aaol aaol = this.f57829b;
                if (aaol.m21764b() && (a = aaol.m21763a(str)) != null) {
                    synchronized (aaol.f28700b) {
                        aaok aaok = (aaok) aaol.f28700b.get(a);
                        if (aaok != null && aaok.f28695c > SystemClock.elapsedRealtime()) {
                            int i4 = aaok.f28696d;
                            StringBuilder sb = new StringBuilder(52);
                            sb.append("Last HTTP status code for blocked entry: ");
                            sb.append(i4);
                            Log.i("GCM.HTTP", sb.toString());
                            i = 2;
                        }
                    }
                }
                if (i == 2) {
                    StringBuilder sb2 = new StringBuilder(28);
                    sb2.append("temporary_blocked");
                    sb2.append(i);
                    String sb3 = sb2.toString();
                    bundle = new Bundle();
                    bundle.putString("name", sb3);
                    bundle.putString("block", "1");
                    String valueOf2 = String.valueOf(str);
                    Log.w("GCM.HTTP", valueOf2.length() == 0 ? new String("HTTP request blocked due to automatic backoff: ") : "HTTP request blocked due to automatic backoff: ".concat(valueOf2));
                }
            } else {
                String valueOf3 = String.valueOf(str);
                Log.w("GCM.HTTP", valueOf3.length() == 0 ? new String("HTTP request blocked due to server rule: ") : "HTTP request blocked due to server rule: ".concat(valueOf3));
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return bundle;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public abpa(Context context) {
        super("com.google.android.gms.http.IGoogleHttpService");
        this.f57828a = context.getApplicationContext();
        this.f57829b = aaol.m21762a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    public final void mo32275a(String str, int i) {
        String a;
        m48029a();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            aaol aaol = this.f57829b;
            if (aaol.m21764b() && (a = aaol.m21763a(str)) != null) {
                synchronized (aaol.f28700b) {
                    if (i > 0 && i < 500 && i != 429) {
                        aaol.f28700b.remove(a);
                    } else {
                        aaok aaok = (aaok) aaol.f28700b.get(a);
                        if (aaok == null) {
                            if (((C1245ok) aaol.f28700b).f26809h >= 100) {
                                String valueOf = String.valueOf(str);
                                Log.w("GCM.HTTP", valueOf.length() == 0 ? new String("Backoff lookup map has grown too big. Not considering for backoff newly failing url: ") : "Backoff lookup map has grown too big. Not considering for backoff newly failing url: ".concat(valueOf));
                            } else {
                                aaok = new aaok(aaol);
                                aaol.f28700b.put(a, aaok);
                            }
                        }
                        int i2 = aaok.f28693a + 1;
                        aaok.f28693a = i2;
                        if (i2 > 3) {
                            aaok.f28694b = ((long) (aaok.f28697e.f28699a.nextInt(9000) + 1000)) + Math.min(((long) aaok.f28693a) * 1000, 86400000L);
                            aaok.f28695c = SystemClock.elapsedRealtime() + aaok.f28694b;
                        }
                        aaok.f28696d = i;
                    }
                }
            }
            if (i > 0) {
                Context context = this.f57828a;
                if (aebw.m51603a()) {
                    aebw.m51602a(context, aapx.GOOGLE_HTTP_CLIENT);
                } else {
                    aphm.m70304b(context);
                }
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle a = mo32274a(parcel.readString());
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a);
        } else if (i != 2) {
            return false;
        } else {
            mo32275a(parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
