package p000;

import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: aghp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aghp extends dck implements aghq {

    /* renamed from: a */
    public final agmn f65526a;

    /* renamed from: b */
    private Boolean f65527b;

    /* renamed from: c */
    private String f65528c;

    public aghp() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    private final void m54223a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f65527b == null) {
                        if ("com.google.android.gms".equals(this.f65528c)) {
                            z2 = true;
                        } else if (!str.m36310a(this.f65526a.mo35690n(), Binder.getCallingUid())) {
                            z2 = rfz.m33557a(this.f65526a.mo35690n()).mo24608b(Binder.getCallingUid());
                        } else {
                            z2 = true;
                        }
                        this.f65527b = Boolean.valueOf(z2);
                    }
                    if (this.f65527b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f65526a.mo35497E().f65564c.mo35436a("Measurement Service called with invalid calling package. appId", agid.m54288a(str));
                    throw e;
                }
            }
            if (this.f65528c == null) {
                if (rfy.m33545a(this.f65526a.mo35690n(), Binder.getCallingUid(), str)) {
                    this.f65528c = str;
                }
            }
            if (!str.equals(this.f65528c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
            return;
        }
        this.f65526a.mo35497E().f65564c.mo35435a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aghp.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      aghp.a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(com.google.android.gms.measurement.internal.UserAttributeParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.UserAttributeParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(java.lang.String, boolean):void */
    /* renamed from: c */
    private final void m54224c(AppMetadata appMetadata) {
        sdo.m34959a(appMetadata);
        m54223a(appMetadata.f80098a, false);
        agms p = this.f65526a.mo35692p();
        String str = appMetadata.f80099b;
        String str2 = appMetadata.f80115r;
        String str3 = appMetadata.f80119v;
        p.mo35748c(str, str2);
    }

    /* renamed from: b */
    public final String mo35402b(AppMetadata appMetadata) {
        m54224c(appMetadata);
        return this.f65526a.mo35679c(appMetadata);
    }

    public aghp(agmn agmn, String str) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        sdo.m34959a(agmn);
        this.f65526a = agmn;
        this.f65528c = str;
    }

    /* renamed from: a */
    public final List mo35391a(String str, String str2, AppMetadata appMetadata) {
        m54224c(appMetadata);
        try {
            return (List) this.f65526a.mo35498F().mo35490a(new agji(this, appMetadata, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f65526a.mo35497E().f65564c.mo35436a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aghp.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      aghp.a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(com.google.android.gms.measurement.internal.UserAttributeParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.UserAttributeParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final List mo35392a(String str, String str2, String str3) {
        m54223a(str, true);
        try {
            return (List) this.f65526a.mo35498F().mo35490a(new agjj(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f65526a.mo35497E().f65564c.mo35436a("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aghp.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      aghp.a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(com.google.android.gms.measurement.internal.UserAttributeParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.UserAttributeParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final List mo35393a(String str, String str2, String str3, boolean z) {
        m54223a(str, true);
        try {
            List<agmr> list = (List) this.f65526a.mo35498F().mo35490a(new agjh(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (agmr agmr : list) {
                if (!z) {
                    if (agms.m54596f(agmr.f65973c)) {
                    }
                }
                arrayList.add(new UserAttributeParcel(agmr));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f65526a.mo35497E().f65564c.mo35437a("Failed to get user properties as. appId", agid.m54288a(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List mo35394a(String str, String str2, boolean z, AppMetadata appMetadata) {
        m54224c(appMetadata);
        try {
            List<agmr> list = (List) this.f65526a.mo35498F().mo35490a(new agjg(this, appMetadata, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (agmr agmr : list) {
                if (!z) {
                    if (agms.m54596f(agmr.f65973c)) {
                    }
                }
                arrayList.add(new UserAttributeParcel(agmr));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f65526a.mo35497E().f65564c.mo35437a("Failed to query user properties. appId", agid.m54288a(appMetadata.f80098a), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final void mo35395a(long j, String str, String str2, String str3) {
        mo35403a(new agjs(this, str2, str3, str, j));
    }

    /* renamed from: a */
    public final void mo35396a(AppMetadata appMetadata) {
        m54224c(appMetadata);
        mo35403a(new agjr(this, appMetadata));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aghp.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      aghp.a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(com.google.android.gms.measurement.internal.UserAttributeParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.UserAttributeParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo35397a(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        sdo.m34959a(conditionalUserPropertyParcel);
        sdo.m34959a(conditionalUserPropertyParcel.f80122c);
        m54223a(conditionalUserPropertyParcel.f80120a, true);
        mo35403a(new agjf(this, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel)));
    }

    /* renamed from: a */
    public final void mo35398a(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        sdo.m34959a(conditionalUserPropertyParcel);
        sdo.m34959a(conditionalUserPropertyParcel.f80122c);
        m54224c(appMetadata);
        ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = new ConditionalUserPropertyParcel(conditionalUserPropertyParcel);
        conditionalUserPropertyParcel2.f80120a = appMetadata.f80098a;
        mo35403a(new agjt(this, conditionalUserPropertyParcel2, appMetadata));
    }

    /* renamed from: a */
    public final void mo35399a(EventParcel eventParcel, AppMetadata appMetadata) {
        sdo.m34959a(eventParcel);
        m54224c(appMetadata);
        mo35403a(new agjm(this, eventParcel, appMetadata));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aghp.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      aghp.a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(com.google.android.gms.measurement.internal.UserAttributeParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.UserAttributeParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo35400a(EventParcel eventParcel, String str, String str2) {
        sdo.m34959a(eventParcel);
        sdo.m34977c(str);
        m54223a(str, true);
        mo35403a(new agjn(this, eventParcel, str));
    }

    /* renamed from: a */
    public final void mo35401a(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        sdo.m34959a(userAttributeParcel);
        m54224c(appMetadata);
        mo35403a(new agjp(this, userAttributeParcel, appMetadata));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35403a(Runnable runnable) {
        sdo.m34959a(runnable);
        if (this.f65526a.mo35498F().mo35495c()) {
            runnable.run();
        } else {
            this.f65526a.mo35498F().mo35492a(runnable);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aghp.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      aghp.a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(com.google.android.gms.measurement.internal.UserAttributeParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghq.a(com.google.android.gms.measurement.internal.UserAttributeParcel, com.google.android.gms.measurement.internal.AppMetadata):void
      aghp.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList;
        byte[] bArr;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        switch (i) {
            case 1:
                mo35399a((EventParcel) dcl.m8163a(parcel3, EventParcel.CREATOR), (AppMetadata) dcl.m8163a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo35401a((UserAttributeParcel) dcl.m8163a(parcel3, UserAttributeParcel.CREATOR), (AppMetadata) dcl.m8163a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                mo35396a((AppMetadata) dcl.m8163a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                mo35400a((EventParcel) dcl.m8163a(parcel3, EventParcel.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                AppMetadata appMetadata = (AppMetadata) dcl.m8163a(parcel3, AppMetadata.CREATOR);
                m54224c(appMetadata);
                mo35403a(new agjl(this, appMetadata));
                parcel2.writeNoException();
                break;
            case 7:
                AppMetadata appMetadata2 = (AppMetadata) dcl.m8163a(parcel3, AppMetadata.CREATOR);
                boolean a = dcl.m8167a(parcel);
                m54224c(appMetadata2);
                try {
                    List<agmr> list = (List) this.f65526a.mo35498F().mo35490a(new agjq(this, appMetadata2)).get();
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (agmr agmr : list) {
                        if (!a) {
                            if (agms.m54596f(agmr.f65973c)) {
                            }
                        }
                        arrayList2.add(new UserAttributeParcel(agmr));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException | ExecutionException e) {
                    this.f65526a.mo35497E().f65564c.mo35437a("Failed to get user properties. appId", agid.m54288a(appMetadata2.f80098a), e);
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel4.writeTypedList(arrayList);
                break;
            case 9:
                EventParcel eventParcel = (EventParcel) dcl.m8163a(parcel3, EventParcel.CREATOR);
                String readString = parcel.readString();
                sdo.m34977c(readString);
                sdo.m34959a(eventParcel);
                m54223a(readString, true);
                this.f65526a.mo35497E().f65571j.mo35436a("Log and bundle. event", this.f65526a.mo35689m().mo35422a(eventParcel.f80132a));
                long c = this.f65526a.mo35691o().mo20507c() / 1000000;
                agjb F = this.f65526a.mo35498F();
                agjo agjo = new agjo(this, eventParcel, readString);
                F.mo35544k();
                sdo.m34959a(agjo);
                agiz agiz = new agiz(F, agjo, true, "Task exception on worker thread");
                if (Thread.currentThread() == F.f65665a) {
                    agiz.run();
                } else {
                    F.mo35491a(agiz);
                }
                try {
                    byte[] bArr2 = (byte[]) agiz.get();
                    if (bArr2 == null) {
                        this.f65526a.mo35497E().f65564c.mo35436a("Log and bundle returned null. appId", agid.m54288a(readString));
                        bArr2 = new byte[0];
                    }
                    this.f65526a.mo35497E().f65571j.mo35438a("Log and bundle processed. event, size, time_ms", this.f65526a.mo35689m().mo35422a(eventParcel.f80132a), Integer.valueOf(bArr2.length), Long.valueOf((this.f65526a.mo35691o().mo20507c() / 1000000) - c));
                    bArr = bArr2;
                } catch (InterruptedException | ExecutionException e2) {
                    this.f65526a.mo35497E().f65564c.mo35438a("Failed to log and bundle. appId, event, error", agid.m54288a(readString), this.f65526a.mo35689m().mo35422a(eventParcel.f80132a), e2);
                    bArr = null;
                }
                parcel2.writeNoException();
                parcel4.writeByteArray(bArr);
                break;
            case 10:
                mo35395a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String b = mo35402b((AppMetadata) dcl.m8163a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel4.writeString(b);
                break;
            case 12:
                mo35398a((ConditionalUserPropertyParcel) dcl.m8163a(parcel3, ConditionalUserPropertyParcel.CREATOR), (AppMetadata) dcl.m8163a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                mo35397a((ConditionalUserPropertyParcel) dcl.m8163a(parcel3, ConditionalUserPropertyParcel.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                List a2 = mo35394a(parcel.readString(), parcel.readString(), dcl.m8167a(parcel), (AppMetadata) dcl.m8163a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel4.writeTypedList(a2);
                break;
            case 15:
                List a3 = mo35393a(parcel.readString(), parcel.readString(), parcel.readString(), dcl.m8167a(parcel));
                parcel2.writeNoException();
                parcel4.writeTypedList(a3);
                break;
            case 16:
                List a4 = mo35391a(parcel.readString(), parcel.readString(), (AppMetadata) dcl.m8163a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel4.writeTypedList(a4);
                break;
            case 17:
                List a5 = mo35392a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel4.writeTypedList(a5);
                break;
            case 18:
                AppMetadata appMetadata3 = (AppMetadata) dcl.m8163a(parcel3, AppMetadata.CREATOR);
                m54223a(appMetadata3.f80098a, false);
                mo35403a(new agjk(this, appMetadata3));
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
