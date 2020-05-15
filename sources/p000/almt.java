package p000;

import android.accounts.Account;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.api.PeopleChimeraService;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

/* renamed from: almt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class almt extends alzo implements aaai {

    /* renamed from: a */
    private final PeopleChimeraService f73791a;

    /* renamed from: b */
    private final aaag f73792b;

    /* renamed from: c */
    private final String f73793c;

    /* renamed from: d */
    private final int f73794d;

    /* renamed from: e */
    private final boolean f73795e;

    /* renamed from: f */
    private final String f73796f;

    /* renamed from: g */
    private final String f73797g;

    /* renamed from: h */
    private final boolean f73798h;

    public almt(PeopleChimeraService peopleChimeraService, aaag aaag, String str, String str2, String str3, boolean z, boolean z2) {
        int callingUid = Binder.getCallingUid();
        this.f73791a = peopleChimeraService;
        this.f73792b = aaag;
        this.f73793c = str;
        this.f73797g = str3;
        this.f73796f = str2;
        this.f73798h = z;
        this.f73795e = z2;
        this.f73794d = callingUid;
    }

    /* renamed from: a */
    private final void m61309a(amqd amqd) {
        aaag aaag = this.f73792b;
        PeopleChimeraService peopleChimeraService = this.f73791a;
        amqd.f75732o = this.f73795e;
        aaag.mo16659a(peopleChimeraService, amqd);
    }

    /* renamed from: a */
    public final void mo40563a(alzm alzm, String str, String str2, String str3) {
    }

    /* renamed from: a */
    public final void mo40569a(alzm alzm, String str, String str2, String str3, List list) {
    }

    /* renamed from: a */
    public final void mo40574a(alzm alzm, String str, String str2, String str3, List list, List list2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
    }

    /* renamed from: b */
    public final Bundle mo40580b(String str, String str2) {
        mo40542a(str, str2, 0);
        return null;
    }

    /* renamed from: b */
    public final void mo40586b(alzm alzm, String str, String str2) {
    }

    /* renamed from: b */
    public final void mo40588b(alzm alzm, String str, String str2, String str3, int i, String str4) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: c */
    public final sce mo40589c(alzm alzm, String str, String str2, int i) {
        boolean z;
        sdo.checkIfNull(alzm, "callbacks");
        sdo.m34969a(str, (Object) "account");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        alpg alpg = new alpg(this.f73793c, this.f73794d, mo40539a(alzm), str, str2);
        m61309a(alpg);
        return alpg.f75727h;
    }

    /* renamed from: c */
    public final void mo40592c(alzm alzm, String str, String str2) {
    }

    /* renamed from: d */
    public final void mo40593d(alzm alzm, Account account, String str) {
        m61309a(new alnf(this.f73793c, this.f73794d, alzm, account, str, alsj.m61651a(this.f73791a)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: e */
    public final sce mo40595e(alzm alzm, String str, String str2) {
        sdo.checkIfNull(alzm, "callbacks");
        sdo.m34969a(str, (Object) "account");
        if (cfzr.m144037f() == 2) {
            throw new UnsupportedOperationException(cfzg.m144007b());
        } else if (cfzr.m144037f() == 1) {
            try {
                alzm.mo40531a(amqv.f75777c.f75784a, amqv.f75777c.f75785b, (DataHolder) null);
                return null;
            } catch (RemoteException e) {
                throw e;
            }
        } else {
            aloe aloe = new aloe(this.f73793c, this.f73794d, alzm, str, str2);
            m61309a(aloe);
            return aloe.f75727h;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final almp mo40539a(alzm alzm) {
        return new almp(alzm, this.f73798h);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: b */
    public final sce mo40581b(alzm alzm, String str, int i, int i2) {
        alon alon;
        sdo.checkIfNull(alzm, "callbacks");
        sdo.m34969a(str, (Object) "avatarUrl");
        allt.m61239a(i, "avatarSize");
        if (cgaa.m144066d() == 2) {
            throw new UnsupportedOperationException(cfzg.m144007b());
        } else if (cgaa.m144066d() == 1) {
            return null;
        } else {
            PeopleChimeraService peopleChimeraService = this.f73791a;
            String str2 = this.f73793c;
            int i3 = this.f73794d;
            amig.m62939a();
            if (((Boolean) amhs.f74921a.mo41191a()).booleanValue()) {
                alon = alon.m61426a(this.f73791a);
            } else {
                alon = null;
            }
            alpc alpc = new alpc(peopleChimeraService, str2, i3, alon, mo40539a(alzm), str, i, i2);
            m61309a(alpc);
            return alpc.f75727h;
        }
    }

    /* renamed from: a */
    public final Bundle mo40540a(alzm alzm, boolean z, String str, String str2, int i) {
        sdo.checkIfNull(alzm, "callbacks");
        almx a = almx.m61368a(this.f73791a);
        boolean z2 = false;
        int i2 = 0;
        if (!z) {
            alzm.asBinder();
            synchronized (a.f73806a) {
                boolean z3 = false;
                while (i2 < a.f73808c.size()) {
                    if (((almw) a.f73808c.get(i2)).f73803d.asBinder() == alzm.asBinder()) {
                        a.f73808c.remove(i2);
                        i2--;
                        z3 = true;
                    }
                    i2++;
                }
                if (z3) {
                    a.mo40596a();
                }
            }
            return null;
        }
        if (i != 0) {
            z2 = true;
        }
        sdo.m34975b(z2, "scopes");
        alzm.asBinder();
        synchronized (a.f73806a) {
            a.f73808c.add(new almw(alzm, str, str2, i));
            if ((i & 8) != 0 && !a.f73810e) {
                a.f73807b.getContentResolver().registerContentObserver(ContactsContract.AUTHORITY_URI, true, a.f73809d);
                a.f73810e = true;
            }
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
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
    @Deprecated
    /* renamed from: d */
    public final void mo40594d(alzm alzm, String str, String str2) {
        mo40550a();
        sdo.checkIfNull(alzm, "callbacks");
        sdo.m34969a(str, (Object) "account");
        sdo.checkIfNull((Object) str2, (Object) "deviceId");
        m61309a(new alpk(alzm, this.f73793c, this.f73794d, str, str2));
    }

    /* renamed from: c */
    public final void mo40590c() {
        boolean z;
        if (ancz.f76649c == null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                ancz.f76649c = new ancz(cgbe.f186279a.mo6606a().mo83448ds());
                new ancz(cgbe.f186279a.mo6606a().mo83449dt());
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        ancz ancz = ancz.f76649c;
        String str = this.f73793c;
        synchronized (ancz.f76651b) {
            Boolean bool = (Boolean) ancz.f76651b.get(str);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                String str2 = ancz.f76650a;
                boolean z2 = true;
                if (!TextUtils.isEmpty(str)) {
                    if ("com.google.android.gms".equals(str) || str.startsWith("com.google.android.gms.")) {
                        ancz.f76651b.put(str, Boolean.valueOf(z2));
                        z = z2;
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
                        sb.append(',');
                        sb.append(str);
                        sb.append(',');
                        if (str2.indexOf(sb.toString()) >= 0) {
                            ancz.f76651b.put(str, Boolean.valueOf(z2));
                            z = z2;
                        }
                    }
                }
                z2 = false;
                ancz.f76651b.put(str, Boolean.valueOf(z2));
                z = z2;
            }
        }
        if (!z) {
            throw new SecurityException("This API can only be called by whitelisted apps.");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: b */
    public final sce mo40582b(alzm alzm, String str, String str2, int i, int i2) {
        sdo.checkIfNull(alzm, "callbacks");
        sdo.m34969a(str, (Object) "account");
        allt.m61239a(i, "avatarSize");
        alpf alpf = new alpf(this.f73793c, this.f73794d, mo40539a(alzm), str, str2, i, i2);
        m61309a(alpf);
        return alpf.f75727h;
    }

    /* renamed from: b */
    public final void mo40583b() {
        sdo.m34970a(false);
    }

    /* renamed from: b */
    public final void mo40584b(alzm alzm, Account account, String str) {
        m61309a(new amqp(this.f73793c, this.f73794d, alzm, account, str, alsj.m61651a(this.f73791a)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: b */
    public final void mo40585b(alzm alzm, String str) {
        sdo.checkIfNull(alzm, "callbacks");
        sdo.m34969a(str, (Object) "account");
        if (cfzo.m144028b() == 2) {
            throw new UnsupportedOperationException(cfzg.m144007b());
        } else if (cfzo.m144028b() != 1) {
            m61309a(new alnh(this.f73791a, this.f73793c, this.f73794d, alzm, str));
        }
    }

    /* renamed from: a */
    public final Bundle mo40541a(String str, String str2) {
        mo40550a();
        return mo40580b(str, str2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: almt.a(java.lang.String, java.lang.String, long, boolean):android.os.Bundle
     arg types: [java.lang.String, java.lang.String, long, int]
     candidates:
      almt.a(alzm, com.google.android.gms.people.identity.internal.AccountToken, java.util.List, com.google.android.gms.people.identity.internal.ParcelableGetOptions):void
      almt.a(alzm, java.lang.String, int, int):void
      almt.a(alzm, java.lang.String, java.lang.String, int):void
      almt.a(alzm, java.lang.String, java.lang.String, android.net.Uri):void
      almt.a(alzm, java.lang.String, java.lang.String, java.lang.String):void
      almt.a(alzm, java.lang.String, java.lang.String, java.lang.String[]):void
      alzp.a(alzm, com.google.android.gms.people.identity.internal.AccountToken, java.util.List, com.google.android.gms.people.identity.internal.ParcelableGetOptions):void
      alzp.a(alzm, java.lang.String, int, int):void
      alzp.a(alzm, java.lang.String, java.lang.String, int):void
      alzp.a(alzm, java.lang.String, java.lang.String, android.net.Uri):void
      alzp.a(alzm, java.lang.String, java.lang.String, java.lang.String):void
      alzp.a(alzm, java.lang.String, java.lang.String, java.lang.String[]):void
      almt.a(java.lang.String, java.lang.String, long, boolean):android.os.Bundle */
    /* renamed from: a */
    public final Bundle mo40542a(String str, String str2, long j) {
        mo40543a(str, str2, j, false);
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: almt.a(java.lang.String, java.lang.String, long, boolean, boolean):android.os.Bundle
     arg types: [java.lang.String, java.lang.String, long, boolean, int]
     candidates:
      almt.a(alzm, boolean, java.lang.String, java.lang.String, int):android.os.Bundle
      almt.a(alzm, java.lang.String, java.lang.String, int, int):void
      almt.a(alzm, java.lang.String, java.lang.String, android.net.Uri, boolean):void
      almt.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List):void
      almt.a(alzm, boolean, boolean, java.lang.String, java.lang.String):void
      alzp.a(alzm, boolean, java.lang.String, java.lang.String, int):android.os.Bundle
      alzp.a(alzm, java.lang.String, java.lang.String, int, int):void
      alzp.a(alzm, java.lang.String, java.lang.String, android.net.Uri, boolean):void
      alzp.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List):void
      alzp.a(alzm, boolean, boolean, java.lang.String, java.lang.String):void
      almt.a(java.lang.String, java.lang.String, long, boolean, boolean):android.os.Bundle */
    /* renamed from: a */
    public final Bundle mo40543a(String str, String str2, long j, boolean z) {
        mo40544a(str, str2, j, z, false);
        return null;
    }

    /* renamed from: b */
    public final void mo40587b(alzm alzm, String str, String str2, int i) {
        mo40589c(alzm, str, str2, i);
    }

    /* renamed from: c */
    public final void mo40591c(alzm alzm, Account account, String str) {
        m61309a(new alni(this.f73793c, this.f73794d, alzm, account, str, alsj.m61651a(this.f73791a)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final Bundle mo40544a(String str, String str2, long j, boolean z, boolean z2) {
        String str3;
        mo40550a();
        sdo.m34969a(str, (Object) "account");
        bxwc bxwc = cfzg.f186196a.mo6606a().mo83162e().f165797a;
        if (!TextUtils.isEmpty(this.f73796f)) {
            str3 = this.f73796f;
        } else {
            str3 = this.f73793c;
        }
        if (!bxwc.contains(str3)) {
            if (cgav.m144111d() == 2) {
                throw new UnsupportedOperationException(cfzg.m144007b());
            } else if (cgav.m144111d() == 1) {
                return null;
            }
        }
        m61309a(new aloh(str3, this.f73794d, this.f73797g, str, str2, j, z, z2));
        return null;
    }

    /* renamed from: a */
    public final sce mo40545a(alzm alzm, AccountToken accountToken, ParcelableListOptions parcelableListOptions) {
        AccountToken accountToken2 = accountToken;
        if (cfzu.m144050b() == 2) {
            throw new UnsupportedOperationException(cfzg.m144007b());
        } else if (cfzu.m144050b() == 1) {
            return null;
        } else {
            alnq alnq = new alnq(this.f73793c, this.f73794d, this.f73797g, alzm, accountToken2.f81709a, accountToken2.f81710b, parcelableListOptions);
            m61309a(alnq);
            return alnq.f75727h;
        }
    }

    /* renamed from: a */
    public final sce mo40546a(alzm alzm, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        sdo.checkIfNull(alzm, "callbacks");
        sdo.checkIfNull(avatarReference, "avatarReference");
        sdo.checkIfNull(parcelableLoadImageOptions, "options");
        if (cgaa.m144065c() == 2) {
            throw new UnsupportedOperationException(cfzg.m144007b());
        } else if (cgaa.m144065c() == 1) {
            return null;
        } else {
            alpb alpb = new alpb(this.f73793c, this.f73794d, mo40539a(alzm), avatarReference, parcelableLoadImageOptions);
            m61309a(alpb);
            return alpb.f75727h;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final sce mo40547a(alzm alzm, String str) {
        sdo.checkIfNull(alzm, "callbacks");
        sdo.m34969a(str, (Object) "url");
        if (cgaa.m144064b() == 2) {
            throw new UnsupportedOperationException(cfzg.m144007b());
        } else if (cgaa.m144064b() == 1) {
            return null;
        } else {
            alop alop = new alop(this.f73793c, this.f73794d, str, mo40539a(alzm), false, "BaseLoadRemoteImageOperation");
            m61309a(alop);
            return alop.f75727h;
        }
    }

    /* renamed from: a */
    public final sce mo40548a(alzm alzm, String str, int i) {
        sdo.m34974b(!TextUtils.isEmpty(str));
        if (cgam.m144095b() == 2) {
            throw new UnsupportedOperationException(cfzg.m144007b());
        } else if (cgam.m144095b() == 1) {
            return null;
        } else {
            aloi aloi = new aloi(this.f73793c, this.f73794d, alzm, ancm.f76634e.split(str), i);
            m61309a(aloi);
            return aloi.f75727h;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final sce mo40549a(alzm alzm, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2) {
        int i4 = i;
        boolean z3 = false;
        Object[] objArr = {str, str2, Boolean.valueOf(z), str3, str4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z2)};
        sdo.checkIfNull(alzm, "callbacks");
        if (i4 == 2) {
            sdo.m34975b(alnv.m61406a(this.f73796f), "Unsupported autocomplete type");
        } else {
            sdo.m34969a(str, (Object) "account");
        }
        sdo.m34975b(i4 == 0 ? true : i4 == 1 || i4 == 2, "Unsupported autocomplete type");
        sdo.m34975b(!z, "Directory search not supported yet");
        sdo.m34975b(!TextUtils.isEmpty(str4), "Query mustn't be empty");
        if (i3 > 0) {
            z3 = true;
        }
        sdo.m34975b(z3, "Invalid numberOfResults");
        if (!cfzg.f186196a.mo6606a().mo83159b().f165797a.contains(this.f73793c)) {
            if (cgad.m144081b() == 2) {
                throw new UnsupportedOperationException(cfzg.m144007b());
            } else if (cgad.m144081b() == 1) {
                return null;
            }
        }
        alnv alnv = new alnv(this.f73793c, this.f73794d, alzm, str, str2, z, str4, i, i3, z2);
        m61309a(alnv);
        return alnv.f75727h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40550a() {
        if (soz.m35807f(this.f73791a)) {
            throw new IllegalArgumentException("account");
        }
    }

    /* renamed from: a */
    public final void mo40551a(alzm alzm, Account account, String str) {
        m61309a(new amqo(this.f73793c, this.f73794d, alzm, account, str, alsj.m61651a(this.f73791a)));
    }

    /* renamed from: a */
    public final void mo40552a(alzm alzm, Uri uri) {
        m61309a(new amql(this.f73793c, this.f73794d, alzm, uri));
    }

    /* renamed from: a */
    public final void mo40553a(alzm alzm, Uri uri, String str) {
        m61309a(new alng(this.f73793c, this.f73794d, mo40539a(alzm), uri, str));
    }

    /* renamed from: a */
    public final void mo40554a(alzm alzm, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        m61309a(new amqm(this.f73793c, this.f73794d, mo40539a(alzm), uri, strArr, str, strArr2, str2));
    }

    /* renamed from: a */
    public final void mo40555a(alzm alzm, Bundle bundle) {
        m61309a(new alns(this.f73793c, this.f73794d, alzm, bundle));
    }

    /* renamed from: a */
    public final void mo40556a(alzm alzm, AccountToken accountToken, List list, ParcelableGetOptions parcelableGetOptions) {
        m61309a(new alnn(this.f73793c, this.f73794d, this.f73797g, alzm, accountToken.f81709a, accountToken.f81710b, list, parcelableGetOptions));
    }

    /* renamed from: a */
    public final void mo40557a(alzm alzm, String str, int i, int i2) {
        mo40581b(alzm, str, i, i2);
    }

    /* renamed from: a */
    public final void mo40558a(alzm alzm, String str, String str2) {
        mo40559a(alzm, str, str2, 3);
    }

    /* renamed from: a */
    public final void mo40559a(alzm alzm, String str, String str2, int i) {
        sdo.checkIfNull(alzm, "callbacks");
        if (cfzr.m144034c() == 2) {
            throw new UnsupportedOperationException(cfzg.m144007b());
        } else if (cfzr.m144034c() == 1) {
            try {
                alzm.mo40531a(amqv.f75777c.f75784a, amqv.f75777c.f75785b, (DataHolder) null);
            } catch (RemoteException e) {
                throw e;
            }
        } else {
            m61309a(new alnx(this.f73793c, this.f73794d, alzm, str, str2, i));
        }
    }

    /* renamed from: a */
    public final void mo40560a(alzm alzm, String str, String str2, int i, int i2) {
        mo40582b(alzm, str, str2, i, i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: almt.a(alzm, java.lang.String, java.lang.String, android.net.Uri, boolean):void
     arg types: [alzm, java.lang.String, java.lang.String, android.net.Uri, int]
     candidates:
      almt.a(alzm, boolean, java.lang.String, java.lang.String, int):android.os.Bundle
      almt.a(java.lang.String, java.lang.String, long, boolean, boolean):android.os.Bundle
      almt.a(alzm, java.lang.String, java.lang.String, int, int):void
      almt.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List):void
      almt.a(alzm, boolean, boolean, java.lang.String, java.lang.String):void
      alzp.a(alzm, boolean, java.lang.String, java.lang.String, int):android.os.Bundle
      alzp.a(java.lang.String, java.lang.String, long, boolean, boolean):android.os.Bundle
      alzp.a(alzm, java.lang.String, java.lang.String, int, int):void
      alzp.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List):void
      alzp.a(alzm, boolean, boolean, java.lang.String, java.lang.String):void
      almt.a(alzm, java.lang.String, java.lang.String, android.net.Uri, boolean):void */
    @Deprecated
    /* renamed from: a */
    public final void mo40561a(alzm alzm, String str, String str2, Uri uri) {
        mo40550a();
        mo40562a(alzm, str, str2, uri, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo40562a(alzm alzm, String str, String str2, Uri uri, boolean z) {
        mo40550a();
        sdo.checkIfNull(alzm, "callbacks");
        sdo.m34969a(str, (Object) "account");
        sdo.checkIfNull(uri, "uri");
        if (!cfzg.f186196a.mo6606a().mo83163f().f165797a.contains(this.f73793c)) {
            if (cgap.m144100b() == 2) {
                throw new UnsupportedOperationException(cfzg.m144007b());
            } else if (cgap.m144100b() == 1) {
                return;
            }
        }
        m61309a(new aloj(this.f73793c, this.f73794d, this.f73797g, alzm, str, str2, uri, z));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    @Deprecated
    /* renamed from: a */
    public final void mo40564a(alzm alzm, String str, String str2, String str3, int i, String str4) {
        sdo.checkIfNull(alzm, "callbacks");
        sdo.m34969a(str, (Object) "account");
        if (!cfzg.m144008c().f165797a.contains(this.f73793c)) {
            if (cfzr.m144033b() == 2) {
                throw new UnsupportedOperationException(cfzg.m144007b());
            } else if (cfzr.m144033b() == 1) {
                return;
            }
        }
        m61309a(new alnw(this.f73793c, this.f73797g, this.f73794d, alzm, str, str2, str3, i, str4, false));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo40565a(alzm alzm, String str, String str2, String str3, int i, String str4, boolean z) {
        sdo.checkIfNull(alzm, "callbacks");
        sdo.m34969a(str, (Object) "account");
        if (!cfzg.m144008c().f165797a.contains(this.f73793c)) {
            if (cfzr.m144033b() == 2) {
                throw new UnsupportedOperationException(cfzg.m144007b());
            } else if (cfzr.m144033b() == 1) {
                return;
            }
        }
        alnw alnw = new alnw(this.f73793c, this.f73797g, this.f73794d, alzm, str, str2, str3, i, str4, z);
        alnw.f75732o = this.f73795e;
        m61309a(alnw);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: almt.a(alzm, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, int, java.lang.String, boolean):void
     arg types: [alzm, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, int, java.lang.String, int]
     candidates:
      almt.a(alzm, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, int, int, boolean):sce
      almt.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, boolean, long, java.lang.String, int):void
      alzp.a(alzm, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, int, int, boolean):sce
      alzp.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, boolean, long, java.lang.String, int):void
      almt.a(alzm, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, int, java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo40566a(alzm alzm, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), str4};
        mo40567a(alzm, str, str2, str3, i, z, i2, i3, str4, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: almt.a(alzm, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, int, java.lang.String, boolean, int, int):void
     arg types: [alzm, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, int, java.lang.String, int, int, int]
     candidates:
      almt.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, boolean, long, java.lang.String, int, int, int):void
      alzp.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, boolean, long, java.lang.String, int, int, int):void
      almt.a(alzm, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, int, java.lang.String, boolean, int, int):void */
    /* renamed from: a */
    public final void mo40567a(alzm alzm, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), str4, Boolean.valueOf(z2)};
        mo40568a(alzm, str, str2, str3, i, z, i2, i3, str4, false, 0, 3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo40568a(alzm alzm, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), str4, Boolean.valueOf(z2), Integer.valueOf(i4), Integer.valueOf(i5)};
        sdo.checkIfNull(alzm, "callbacks");
        sdo.m34969a(str, (Object) "account");
        if (cfzr.m144035d() == 2) {
            throw new UnsupportedOperationException(cfzg.m144007b());
        } else if (cfzr.m144035d() != 1) {
            m61309a(new aloc(this.f73793c, this.f73794d, alzm, str, str2, str3, i, z, i2, i3, str4, i4, i5));
        }
    }

    /* renamed from: a */
    public final void mo40570a(alzm alzm, String str, String str2, String str3, List list, int i, boolean z, long j) {
        Object[] objArr = {str, str2, str3, list, Integer.valueOf(i), Boolean.valueOf(z), Long.valueOf(j)};
        mo40571a(alzm, str, str2, str3, list, i, z, j, (String) null, 0);
    }

    /* renamed from: a */
    public final void mo40571a(alzm alzm, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2) {
        Object[] objArr = {str, str2, str3, list, Integer.valueOf(i), Boolean.valueOf(z), Long.valueOf(j), str4, Integer.valueOf(i2)};
        mo40572a(alzm, str, str2, str3, list, i, z, j, str4, i2, 0);
    }

    /* renamed from: a */
    public final void mo40572a(alzm alzm, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2, int i3) {
        Object[] objArr = {str, str2, str3, list, Integer.valueOf(i), Boolean.valueOf(z), Long.valueOf(j), str4, Integer.valueOf(i2), Integer.valueOf(i3)};
        mo40573a(alzm, str, str2, str3, list, i, z, j, str4, i2, i3, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo40573a(alzm alzm, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2, int i3, int i4) {
        boolean z2;
        boolean z3 = false;
        Object[] objArr = {str, str2, str3, list, Integer.valueOf(i), Boolean.valueOf(z), Long.valueOf(j), str4, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        sdo.checkIfNull(alzm, "callbacks");
        sdo.m34969a(str, (Object) "account");
        if ((i & 2097151) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34975b(z2, "projection");
        if (!TextUtils.isEmpty(str4)) {
            if (i2 != 0) {
                z3 = true;
            }
            sdo.m34975b(z3, "searchFields");
        }
        if (cfzr.m144036e() == 2) {
            throw new UnsupportedOperationException(cfzg.m144007b());
        } else if (cfzr.m144036e() != 1) {
            m61309a(new alod(this.f73793c, this.f73794d, alzm, str, str2, str3, list, i, z, j, str4, i2, i4, i3));
        }
    }

    /* renamed from: a */
    public final void mo40575a(alzm alzm, String str, String str2, String str3, boolean z, int i) {
        mo40576a(alzm, str, str2, str3, z, i, 0);
    }

    /* renamed from: a */
    public final void mo40576a(alzm alzm, String str, String str2, String str3, boolean z, int i, int i2) {
        mo40566a(alzm, str, str2, str3, 7, z, i, i2, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
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
    @Deprecated
    /* renamed from: a */
    public final void mo40577a(alzm alzm, String str, String str2, String[] strArr) {
        mo40550a();
        sdo.checkIfNull(alzm, "callbacks");
        sdo.m34969a(str, (Object) "account");
        sdo.checkIfNull((Object) str2, (Object) "deviceId");
        sdo.checkIfNull(strArr, "sources");
        m61309a(new alpm(alzm, this.f73793c, this.f73794d, str, str2, strArr));
    }

    /* renamed from: a */
    public final void mo40578a(alzm alzm, boolean z, boolean z2, String str, String str2) {
        mo40579a(alzm, z, z2, str, str2, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final void mo40579a(alzm alzm, boolean z, boolean z2, String str, String str2, int i) {
        int i2 = i;
        sdo.checkIfNull(alzm, "callbacks");
        boolean z3 = true;
        if (!(i2 == 0 || i2 == 1)) {
            z3 = false;
        }
        sdo.m34974b(z3);
        if (z) {
            sdo.m34969a(str, (Object) "account");
        }
        if (!cfzg.f186196a.mo6606a().mo83161d().f165797a.contains(this.f73793c)) {
            if (cgag.m144086b() == 2) {
                throw new UnsupportedOperationException(cfzg.m144007b());
            } else if (cgag.m144086b() == 1) {
                return;
            }
        }
        m61309a(new alob(this.f73793c, this.f73794d, alzm, z, z2, str, str2, i));
    }
}
