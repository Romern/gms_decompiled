package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.lockbox.LockboxAlarmChimeraReceiver;
import com.google.android.gms.lockbox.LockboxOptInOptions;
import com.google.android.gms.lockbox.internal.LockboxOptInFlags;
import com.google.android.gms.lockbox.internal.LockboxSignedInStatus;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aezd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aezd extends dck implements aeze {

    /* renamed from: a */
    private final Context f64033a;

    /* renamed from: b */
    private final String f64034b;

    /* renamed from: c */
    private final aezn f64035c;

    /* renamed from: d */
    private final qws f64036d;

    /* renamed from: e */
    private final qxq f64037e;

    /* renamed from: f */
    private aezf f64038f;

    public aezd() {
        super("com.google.android.gms.lockbox.internal.ILockboxService");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aezd(Context context, String str) {
        super("com.google.android.gms.lockbox.internal.ILockboxService");
        aezn a = aezn.m52734a(context);
        rjo rjo = auzz.f92845a;
        this.f64033a = context;
        this.f64034b = str;
        this.f64035c = a;
        this.f64036d = new qws(context, "LB_COUNTERS", null);
        this.f64037e = new qxq(this.f64036d, "LB_COUNTERS", 100);
    }

    /* renamed from: a */
    public static LockboxOptInFlags m52711a(Account account) {
        try {
            return new LockboxOptInFlags(account.name, ((Boolean) aezo.f64047a.mo58362b(account).mo58355a(4).get(15, TimeUnit.SECONDS)).booleanValue(), false);
        } catch (ExecutionException | TimeoutException e) {
            return new LockboxOptInFlags(account.name, false, false);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            return new LockboxOptInFlags(account.name, false, false);
        }
    }

    /* renamed from: a */
    private final void m52712a(String str, bxok bxok) {
        String str2;
        boolean z;
        Account account = new Account(str, "com.google");
        int i = bxok.f164163a;
        if (!((i & 1) == 0 && (i & 2) == 0)) {
            try {
                bxok bxok2 = (bxok) aezo.f64047a.mo58362b(account).mo58358a().get();
                int i2 = bxok.f164163a;
                if ((i2 & 2) == 0 || ((bxok2.f164163a & 2) != 0 && bxok2.f164165c == bxok.f164165c)) {
                    String str3 = "";
                    if ((i2 & 1) == 0) {
                        str2 = str3;
                    } else if ((bxok2.f164163a & 1) != 0 && bxok2.f164164b == (z = bxok.f164164b)) {
                        StringBuilder sb = new StringBuilder(13);
                        sb.append(" SwaaDL=");
                        sb.append(z);
                        str2 = sb.toString();
                    }
                    if ((bxok.f164163a & 2) != 0) {
                        boolean z2 = bxok.f164165c;
                        StringBuilder sb2 = new StringBuilder(11);
                        sb2.append(" DiDL=");
                        sb2.append(z2);
                        str3 = sb2.toString();
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(str3).length());
                    sb3.append("[");
                    sb3.append(str2);
                    sb3.append(str3);
                    sb3.append(" ]");
                    String sb4 = sb3.toString();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(sb4).length() + 98);
                    sb5.append("NOT calling FACS Cache to write ");
                    sb5.append(sb4);
                    sb5.append(" because that's already the current state (write cycle avoidance).");
                    Log.i("LockboxBrokerService", sb5.toString());
                }
            } catch (ExecutionException e) {
                Log.e("LockboxBrokerService", "ExecutionException while reading settings with FACS Cache: ", e);
            } catch (InterruptedException e2) {
                Log.e("LockboxBrokerService", "InterruptedException while reading settings with FACS Cache: ", e2);
                Thread.currentThread().interrupt();
            }
            bdtq b = aezo.f64047a.mo58362b(account);
            bxvd da = bxqf.f164373f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxqf bxqf = (bxqf) da.f164949b;
            bxok.getClass();
            bxqf.f164378d = bxok;
            bxqf.f164375a |= 8;
            try {
                b.mo58360a((bxqf) da.mo74062i()).get();
            } catch (ExecutionException e3) {
                Log.e("LockboxBrokerService", "ExecutionException while writing settings with FACS Cache: ", e3);
                return;
            } catch (InterruptedException e4) {
                Log.e("LockboxBrokerService", "InterruptedException while writing settings with FACS Cache: ", e4);
                Thread.currentThread().interrupt();
                return;
            }
        }
        this.f64035c.mo34681a(str);
    }

    /* renamed from: a */
    public final LockboxOptInFlags mo34675a(String str) {
        if (!cfbl.f183588a.mo6606a().mo80808a()) {
            this.f64037e.mo24383c("GetOptInViaLegacyCheck").mo24359a();
            this.f64037e.mo24388e();
            return new LockboxOptInFlags(str, this.f64035c.mo34683a(str, 1), this.f64035c.mo34683a(str, 2));
        } else if (cfbu.f183600a.mo6606a().mo80817a()) {
            return m52711a(new Account(str, "com.google"));
        } else {
            try {
                this.f64037e.mo24383c("GetOptInViaUdcAttempt").mo24359a();
                qxn d = this.f64037e.mo24386d();
                aucb C = auzz.m78131a(this.f64033a, new auzy(str)).mo24671C();
                rkj rkj = (rkj) aucu.m76783a(C, cfbf.m138607b(), TimeUnit.SECONDS);
                d.mo24369a(this.f64037e.mo24389f("GetOptInQueryUdcTimer"));
                if (C.mo50384b()) {
                    if (rkj != null) {
                        this.f64037e.mo24383c("GetOptInViaUdcSuccess").mo24359a();
                        this.f64037e.mo24388e();
                        return new LockboxOptInFlags(str, rkj.mo24822p(), rkj.mo24823q());
                    }
                }
                this.f64037e.mo24383c("GetOptInViaUdcConnectFail").mo24359a();
            } catch (ExecutionException | TimeoutException e) {
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
            }
            this.f64037e.mo24383c("GetOptInViaUdcFallbackAsFalse").mo24359a();
            this.f64037e.mo24388e();
            return new LockboxOptInFlags(str, false, false);
        }
    }

    /* renamed from: a */
    public final LockboxSignedInStatus mo34673a() {
        String a;
        String string;
        long j;
        aezn aezn = this.f64035c;
        synchronized (aezn.f64046a) {
            a = aezn.mo34680a();
        }
        aezn aezn2 = this.f64035c;
        synchronized (aezn2.f64046a) {
            string = aezn2.f64046a.getString("client-instance-id", null);
        }
        aezn aezn3 = this.f64035c;
        synchronized (aezn3.f64046a) {
            j = aezn3.f64046a.getLong("signed-in-timestamp", 0);
        }
        return new LockboxSignedInStatus(a, string, j);
    }

    /* renamed from: a */
    public final void mo34674a(String str, String str2) {
        if (Binder.getCallingUid() != Process.myUid()) {
            String str3 = this.f64034b;
            String a = cfca.f183606a.mo6606a().mo80821a();
            if (!a.isEmpty()) {
                TextUtils.SimpleStringSplitter<String> simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
                simpleStringSplitter.setString(a);
                for (String str4 : simpleStringSplitter) {
                    if (str4.equals(str3)) {
                    }
                }
            }
            throw new SecurityException("Access denied");
        }
        aezn aezn = this.f64035c;
        synchronized (aezn.f64046a) {
            aezn.f64046a.getString("signed-in-account", null);
            SharedPreferences.Editor edit = aezn.f64046a.edit();
            if (!TextUtils.isEmpty(str)) {
                edit.putString("signed-in-account", str);
                edit.putString("client-instance-id", str2);
                edit.putLong("signed-in-timestamp", System.currentTimeMillis());
            } else {
                edit.remove("signed-in-account");
                edit.remove("client-instance-id");
                edit.remove("signed-in-timestamp");
            }
            edit.apply();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aezf aezf;
        boolean z;
        boolean z2;
        boolean z3;
        switch (i) {
            case 2:
                LockboxOptInFlags a = mo34675a(parcel.readString());
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                break;
            case 3:
                LockboxOptInFlags lockboxOptInFlags = (LockboxOptInFlags) dcl.m8163a(parcel, LockboxOptInFlags.CREATOR);
                String str = lockboxOptInFlags.f79796a;
                if (cfbl.m138616b()) {
                    sre.m36089i(this.f64033a);
                    bxvd da = bxok.f164161d.mo74144da();
                    boolean z4 = lockboxOptInFlags.f79797b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxok bxok = (bxok) da.f164949b;
                    int i2 = bxok.f164163a | 1;
                    bxok.f164163a = i2;
                    bxok.f164164b = z4;
                    boolean z5 = lockboxOptInFlags.f79798c;
                    bxok.f164163a = 2 | i2;
                    bxok.f164165c = z5;
                    m52712a(str, (bxok) da.mo74062i());
                } else {
                    this.f64035c.mo34682a(str, 1, lockboxOptInFlags.f79797b);
                    this.f64035c.mo34682a(str, 2, lockboxOptInFlags.f79798c);
                    this.f64035c.mo34681a(str);
                    sbv.m34875a(this.f64033a, str, new int[]{8, 7});
                }
                if (lockboxOptInFlags.f79797b || lockboxOptInFlags.f79798c) {
                    Context context = this.f64033a;
                    context.sendBroadcast(LockboxAlarmChimeraReceiver.m67120a(context));
                }
                parcel2.writeNoException();
                break;
            case 4:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.lockbox.internal.ILockboxStatusChangedListener");
                    aezf = queryLocalInterface instanceof aezf ? (aezf) queryLocalInterface : new aezf(readStrongBinder);
                } else {
                    aezf = null;
                }
                this.f64038f = aezf;
                synchronized (aezn.f64044c) {
                    aezn.f64043b.add(aezf);
                }
                parcel2.writeNoException();
                break;
            case 5:
                aezf aezf2 = this.f64038f;
                if (aezf2 != null) {
                    synchronized (aezn.f64044c) {
                        aezn.f64043b.remove(aezf2);
                    }
                }
                parcel2.writeNoException();
                break;
            case 6:
                String readString = parcel.readString();
                LockboxOptInOptions lockboxOptInOptions = (LockboxOptInOptions) dcl.m8163a(parcel, LockboxOptInOptions.CREATOR);
                if (cfbl.m138616b()) {
                    sre.m36089i(this.f64033a);
                    bxvd da2 = bxok.f164161d.mo74144da();
                    int i3 = lockboxOptInOptions.f79793a;
                    if (i3 == 0) {
                        z = false;
                    } else {
                        if (i3 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bxok bxok2 = (bxok) da2.f164949b;
                        bxok2.f164163a |= 1;
                        bxok2.f164164b = z;
                    }
                    int i4 = lockboxOptInOptions.f79794b;
                    if (i4 != 0) {
                        boolean z6 = i4 == 1;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bxok bxok3 = (bxok) da2.f164949b;
                        bxok3.f164163a = 2 | bxok3.f164163a;
                        bxok3.f164165c = z6;
                        z |= z6;
                    }
                    m52712a(readString, (bxok) da2.mo74062i());
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i5 = lockboxOptInOptions.f79793a;
                    if (i5 == 0) {
                        z2 = false;
                    } else {
                        if (i5 == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f64035c.mo34682a(readString, 1, z2);
                        arrayList.add(bxsl.SUPPL_WEB_AND_APP);
                    }
                    int i6 = lockboxOptInOptions.f79794b;
                    if (i6 != 0) {
                        if (i6 == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.f64035c.mo34682a(readString, 2, z3);
                        arrayList.add(bxsl.DEVICE_INFO);
                        z2 = z3 | z2;
                    }
                    this.f64035c.mo34681a(readString);
                    int[] iArr = new int[arrayList.size()];
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        iArr[i7] = ((bxsl) arrayList.get(i7)).f164712l;
                    }
                    sbv.m34875a(this.f64033a, readString, iArr);
                }
                if (z) {
                    Context context2 = this.f64033a;
                    context2.sendBroadcast(LockboxAlarmChimeraReceiver.m67120a(context2));
                }
                parcel2.writeNoException();
                break;
            case 7:
                mo34674a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 8:
                LockboxSignedInStatus a2 = mo34673a();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a2);
                break;
            case 9:
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList();
                for (Account account : soz.m35801d(this.f64033a, this.f64034b)) {
                    LockboxOptInFlags a3 = mo34675a(account.name);
                    if (readInt == 1) {
                        if (!a3.f79797b) {
                        }
                    } else if (readInt == 2) {
                        if (!a3.f79798c) {
                        }
                    }
                    arrayList2.add(account.name);
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList2);
                break;
            case 10:
                parcel2.writeNoException();
                dcl.m8166a(parcel2, true);
                break;
            default:
                return false;
        }
        return true;
    }
}
