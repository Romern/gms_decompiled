package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: avuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avuu extends dck implements avuv {

    /* renamed from: a */
    private final sbe f93942a;

    /* renamed from: b */
    private final avvj f93943b;

    /* renamed from: c */
    private final Context f93944c;

    public avuu() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r1 = com.google.android.gms.usagereporting.UsageReportingOptInOptions.m93763a();
        r1.f93938a = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (p000.aytw.m84815b(r0.f93988c) != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r3 != 1) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (((long) r2) < p000.chdz.m148556c()) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        r1.f93939b = true;
        r0 = r0.f93988c;
        r0 = p000.soz.m35801d(r0, r0.getPackageName()).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        if (r0.hasNext() == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        r1.f93940c.add(((android.accounts.Account) r0.next()).name);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
        r9.mo51622a(com.google.android.gms.common.api.Status.f30107a, r1.mo51617a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (((android.os.UserManager) r0.f93988c.getSystemService("user")).getUserCount() <= 1) goto L_0x002d;
     */
    /* renamed from: a */
    public final void mo51628a(avup avup) {
        avvn a = avvn.m79436a();
        synchronized (a.f93986a) {
            SharedPreferences b = a.mo51647b();
            int i = 2;
            if (b != null) {
                if (chdq.f188500a.mo6606a().mo85150a()) {
                    int i2 = Build.VERSION.SDK_INT;
                }
                if (!chdn.m148524e() || avvn.m79442b(b)) {
                    if (avvn.m79438a(b)) {
                        i = 1;
                    }
                    int i3 = b.getInt("OptInGMSCoreVersion", -1);
                } else {
                    int i4 = Build.VERSION.SDK_INT;
                    if (avvm.m79435a(a.f93988c)) {
                        i = 1;
                    }
                    int i32 = b.getInt("OptInGMSCoreVersion", -1);
                }
            } else {
                Status status = Status.f30109c;
                avul a2 = UsageReportingOptInOptions.m93763a();
                a2.f93938a = 2;
                avup.mo51622a(status, a2.mo51617a());
            }
        }
    }

    /* renamed from: b */
    public final void mo51633b(avus avus, avup avup) {
        avvn a = avvn.m79436a();
        synchronized (a.f93987b) {
            a.f93987b.remove(avus);
        }
        avup.mo51625c(Status.f30107a);
    }

    /* renamed from: c */
    public final void mo51634c(avus avus, avup avup) {
        avvn a = avvn.m79436a();
        synchronized (a.f93987b) {
            Iterator it = a.f93987b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((avus) it.next()).asBinder() == avus.asBinder()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        avup.mo51625c(Status.f30107a);
    }

    public avuu(String str, Context context) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        this.f93942a = new sbe(str);
        this.f93943b = new avvj(str);
        this.f93944c = context;
    }

    /* renamed from: a */
    public final void mo51629a(avus avus, avup avup) {
        avvn a = avvn.m79436a();
        synchronized (a.f93987b) {
            a.f93987b.add(avus);
        }
        avup.mo51624b(Status.f30107a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo51630a(UsageReportingOptInOptions usageReportingOptInOptions, avup avup) {
        boolean z;
        if (aytw.m84813a(this.f93944c)) {
            avup.mo51620a(Status.f30109c);
            return;
        }
        this.f93942a.mo25332b();
        this.f93943b.mo51639a(chdz.m148555b(), "setOptInOptions");
        avvn a = avvn.m79436a();
        avvj avvj = this.f93943b;
        sdo.m34971a(aytw.m84815b(a.f93988c), (Object) "User is not unlocked.");
        if (a.mo51645a(usageReportingOptInOptions, avvj)) {
            int i = usageReportingOptInOptions.f109538a;
            boolean z2 = true;
            if (i == 0) {
                z = false;
            } else {
                boolean z3 = i == 1;
                synchronized (a.f93986a) {
                    SharedPreferences b = a.mo51647b();
                    rzz.m34727a(b, "Unexpected null from getPrefs.");
                    SharedPreferences.Editor edit = b.edit();
                    if (!z3) {
                        edit.remove("OptInGMSCoreVersion");
                    } else {
                        edit.putInt("OptInGMSCoreVersion", spn.m35881e(a.f93988c));
                    }
                    if (usageReportingOptInOptions.f109543f) {
                        avvj.mo51639a(chdz.f188510a.mo6606a().mo85158b(), "setting CbFromSetupWizard to true");
                    }
                    edit.putBoolean("CbFromSetupWizard", usageReportingOptInOptions.f109543f);
                    boolean a2 = avvn.m79438a(b);
                    if (avvn.m79442b(b)) {
                        if (z3 == a2) {
                            edit.apply();
                            z = false;
                        }
                    }
                    edit.putBoolean("OptInUsageReporting", z3);
                    edit.apply();
                    z = z3 != a2;
                }
            }
            avup.mo51620a(Status.f30107a);
            if (z) {
                if (chdn.m148524e()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (!avvm.m79434a()) {
                        Context context = a.f93988c;
                        if (usageReportingOptInOptions.f109538a != 1) {
                            z2 = false;
                        }
                        avvm.m79433a(context, z2);
                    } else {
                        a.mo51644a(a.f93988c);
                    }
                }
                synchronized (a.f93987b) {
                    Iterator it = a.f93987b.iterator();
                    while (it.hasNext()) {
                        try {
                            ((avus) it.next()).mo51627a();
                        } catch (RemoteException e) {
                            it.remove();
                        }
                    }
                }
                if (usageReportingOptInOptions.f109538a == 2) {
                    SharedPreferences.Editor edit2 = a.f93988c.getSharedPreferences("CheckinLogging", 0).edit();
                    edit2.remove("logging_id");
                    edit2.commit();
                    return;
                }
                return;
            }
            return;
        }
        avup.mo51620a(Status.f30109c);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final void mo51631a(String str, avup avup) {
        if (aytw.m84813a(this.f93944c)) {
            avup.mo51616a(Status.f30109c, false, ConsentInformation.f109531a);
            return;
        }
        avvl avvl = new avvl(avvn.m79436a());
        Context context = this.f93944c;
        sdo.checkIfNull((Object) str, (Object) "Log source cannot be null");
        try {
            bymi bymi = (bymi) GeneratedMessageLite.m124014a(bymi.f167024b, Base64.decode(chdn.f188491a.mo6606a().mo85142a(), 0));
            str.getClass();
            if (bymi.f167026a.containsKey(str)) {
                str.getClass();
                bxww bxww = bymi.f167026a;
                if (bxww.containsKey(str)) {
                    avvl.mo51640a(context, (bymg) bxww.get(str), avup);
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Consent Rules did not contain the given log source");
        } catch (bxwf e) {
            avup.mo51616a(Status.f30109c, false, ConsentInformation.f109531a);
        } catch (IllegalArgumentException e2) {
            avup.mo51616a(Status.f30109c, false, ConsentInformation.f109531a);
        }
    }

    /* renamed from: a */
    public final void mo51632a(String str, ConsentInformation consentInformation, avup avup) {
        ConsentInformation consentInformation2;
        String str2 = str;
        ConsentInformation consentInformation3 = consentInformation;
        avvl avvl = new avvl(avvn.m79436a());
        if (str2 == null) {
            avts b = ConsentInformation.m93760b();
            b.f93900a = consentInformation3.f109532b;
            if (chdn.m148521b()) {
                b.f93901b = consentInformation3.f109533c;
            }
            bngx e = bngx.m109376e();
            List a = consentInformation.mo59682a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                ConsentInformation.AccountConsentInformation accountConsentInformation = (ConsentInformation.AccountConsentInformation) a.get(i);
                b.mo51611a(new ConsentInformation.AccountConsentInformation(accountConsentInformation.f109535a, accountConsentInformation.f109536b, e));
            }
            consentInformation2 = b.mo51610a();
        } else {
            avts b2 = ConsentInformation.m93760b();
            b2.f93900a = consentInformation3.f109532b;
            if (chdn.m148521b()) {
                b2.f93901b = consentInformation3.f109533c;
            }
            HashMap hashMap = new HashMap();
            List a2 = consentInformation.mo59682a();
            int size2 = a2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ConsentInformation.AccountConsentInformation accountConsentInformation2 = (ConsentInformation.AccountConsentInformation) a2.get(i2);
                bngs j = bngx.m109377j();
                List a3 = accountConsentInformation2.mo59686a();
                int size3 = a3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Integer num = (Integer) a3.get(i3);
                    if (num.intValue() == bymk.NO_WHITELIST.f167032d) {
                        j.mo67668c(num);
                    } else if (!hashMap.containsKey(num)) {
                        List a4 = avvl.f93983b.mo51641a(num.intValue());
                        if (a4 == null || !a4.contains(str2)) {
                            hashMap.put(num, false);
                        } else {
                            j.mo67668c(num);
                            hashMap.put(num, true);
                        }
                    } else if (((Boolean) hashMap.get(num)).booleanValue()) {
                        j.mo67668c(num);
                    }
                }
                bngx a5 = j.mo67664a();
                if (!a5.isEmpty()) {
                    b2.mo51611a(new ConsentInformation.AccountConsentInformation(accountConsentInformation2.f109535a, accountConsentInformation2.f109536b, a5));
                }
            }
            consentInformation2 = b2.mo51610a();
        }
        avup.mo51621a(Status.f30107a, consentInformation2);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        avus avus;
        avus avus2;
        avup avup;
        avus avus3;
        avup avup2 = null;
        switch (i) {
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
                    avup2 = queryLocalInterface instanceof avup ? (avup) queryLocalInterface : new avun(readStrongBinder);
                }
                mo51628a(avup2);
                break;
            case 3:
                UsageReportingOptInOptions usageReportingOptInOptions = (UsageReportingOptInOptions) dcl.m8163a(parcel, UsageReportingOptInOptions.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
                    if (queryLocalInterface2 instanceof avup) {
                        avup2 = (avup) queryLocalInterface2;
                    } else {
                        avup2 = new avun(readStrongBinder2);
                    }
                }
                mo51630a(usageReportingOptInOptions, avup2);
                break;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
                    avus = queryLocalInterface3 instanceof avus ? (avus) queryLocalInterface3 : new avuq(readStrongBinder3);
                } else {
                    avus = null;
                }
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
                    if (queryLocalInterface4 instanceof avup) {
                        avup2 = (avup) queryLocalInterface4;
                    } else {
                        avup2 = new avun(readStrongBinder4);
                    }
                }
                mo51629a(avus, avup2);
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
                    avus2 = queryLocalInterface5 instanceof avus ? (avus) queryLocalInterface5 : new avuq(readStrongBinder5);
                } else {
                    avus2 = null;
                }
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
                    if (queryLocalInterface6 instanceof avup) {
                        avup2 = (avup) queryLocalInterface6;
                    } else {
                        avup2 = new avun(readStrongBinder6);
                    }
                }
                mo51633b(avus2, avup2);
                break;
            case 6:
                int readInt = parcel.readInt();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
                    avup = queryLocalInterface7 instanceof avup ? (avup) queryLocalInterface7 : new avun(readStrongBinder7);
                } else {
                    avup = null;
                }
                if (!aytw.m84813a(this.f93944c)) {
                    avvn.m79436a().mo51642a(readInt, avup);
                    break;
                } else {
                    avup.mo51623a(Status.f30109c, (List) null);
                    break;
                }
            case 7:
                int readInt2 = parcel.readInt();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
                    if (queryLocalInterface8 instanceof avup) {
                        avup2 = (avup) queryLocalInterface8;
                    } else {
                        avup2 = new avun(readStrongBinder8);
                    }
                }
                if (!aytw.m84813a(this.f93944c)) {
                    this.f93942a.mo25332b();
                    this.f93943b.mo51639a(chdz.m148555b(), "setAppWhitelist");
                    avvn.m79436a().mo51643a(readInt2, createStringArrayList, avup2);
                    break;
                } else {
                    avup2.mo51626d(Status.f30109c);
                    break;
                }
            case 8:
                String readString = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
                    if (queryLocalInterface9 instanceof avup) {
                        avup2 = (avup) queryLocalInterface9;
                    } else {
                        avup2 = new avun(readStrongBinder9);
                    }
                }
                mo51631a(readString, avup2);
                break;
            case 9:
                String readString2 = parcel.readString();
                ConsentInformation consentInformation = (ConsentInformation) dcl.m8163a(parcel, ConsentInformation.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
                    if (queryLocalInterface10 instanceof avup) {
                        avup2 = (avup) queryLocalInterface10;
                    } else {
                        avup2 = new avun(readStrongBinder10);
                    }
                }
                mo51632a(readString2, consentInformation, avup2);
                break;
            case 10:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
                    avus3 = queryLocalInterface11 instanceof avus ? (avus) queryLocalInterface11 : new avuq(readStrongBinder11);
                } else {
                    avus3 = null;
                }
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
                    if (queryLocalInterface12 instanceof avup) {
                        avup2 = (avup) queryLocalInterface12;
                    } else {
                        avup2 = new avun(readStrongBinder12);
                    }
                }
                mo51634c(avus3, avup2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
