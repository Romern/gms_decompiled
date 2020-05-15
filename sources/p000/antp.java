package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.internal.model.acls.AclsRequest;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.service.DefaultChimeraIntentService;
import com.google.android.gms.plus.service.PlusChimeraService;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;

/* renamed from: antp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class antp extends dck implements antq {

    /* renamed from: a */
    public final Context f77720a;

    /* renamed from: b */
    private final ClientContext f77721b;

    /* renamed from: c */
    private final String[] f77722c;

    /* renamed from: d */
    private final antw f77723d;

    public antp() {
        super("com.google.android.gms.plus.internal.IPlusInternalService");
    }

    /* renamed from: a */
    public final String mo42252a() {
        return this.f77723d.mo42281a();
    }

    /* renamed from: b */
    public final void mo42270b(antn antn, int i, int i2, String str) {
        PlusChimeraService.m68557a();
        sdo.m34959a(antn);
        DefaultChimeraIntentService.m68555a(this.f77720a, new aobs(this.f77721b, i, i2, str, antn));
    }

    /* renamed from: c */
    public final void mo42273c(antn antn, Post post) {
        PlusChimeraService.m68557a();
        DefaultChimeraIntentService.m68555a(this.f77720a, new aoca(this.f77721b, antn, post));
    }

    /* renamed from: d */
    public final void mo42275d(antn antn, String str) {
        PlusChimeraService.m68557a();
        DefaultChimeraIntentService.m68555a(this.f77720a, new aocf(str, antn));
    }

    /* renamed from: e */
    public final void mo42276e(antn antn, String str) {
        PlusChimeraService.m68557a();
        sdo.m34959a(antn);
        sdo.m34975b(!TextUtils.isEmpty(str), "The momentId parameter is required.");
        DefaultChimeraIntentService.m68555a(this.f77720a, new aocd(this.f77721b, str, antn));
    }

    /* renamed from: f */
    public final void mo42277f(antn antn, String str) {
        PlusChimeraService.m68557a();
        sdo.m34959a(antn);
        sdo.m34975b(!TextUtils.isEmpty(str), "The momentId parameter is required.");
        DefaultChimeraIntentService.m68555a(this.f77720a, new aoby(this.f77721b, str, antn));
    }

    /* renamed from: a */
    public final void mo42253a(antn antn) {
        this.f77723d.mo42282a(new aoau(antn));
    }

    public antp(Context context, ClientContext clientContext, ClientContext clientContext2) {
        super("com.google.android.gms.plus.internal.IPlusInternalService");
        this.f77720a = context;
        this.f77721b = clientContext2;
        this.f77722c = clientContext2 != null ? clientContext2.mo17813h() : null;
        this.f77723d = new antw(context, clientContext, clientContext2);
    }

    /* renamed from: a */
    public final void mo42254a(antn antn, int i, int i2, String str) {
        DefaultChimeraIntentService.m68555a(this.f77720a, new aocc(this.f77721b, (String) PlusChimeraService.f82609a.get(i), i2, str, antn));
    }

    /* renamed from: c */
    public final void mo42274c(antn antn, String str) {
        PlusChimeraService.m68557a();
        DefaultChimeraIntentService.m68555a(this.f77720a, new aobx(this.f77721b, str, antn));
    }

    /* renamed from: b */
    public final void mo42271b(antn antn, Post post) {
        PlusChimeraService.m68557a();
        DefaultChimeraIntentService.m68555a(this.f77720a, new aocb(this.f77721b, antn, post));
    }

    /* renamed from: a */
    public final void mo42255a(antn antn, int i, String str) {
        DefaultChimeraIntentService.m68555a(this.f77720a, new aobv(this.f77721b, antn));
    }

    /* renamed from: a */
    public final void mo42256a(antn antn, Uri uri, Bundle bundle) {
        this.f77723d.mo42283a(new aoau(antn), uri, bundle);
    }

    /* renamed from: b */
    public final void mo42272b(antn antn, String str) {
        this.f77723d.mo42287b(new aoau(antn), str);
    }

    /* renamed from: a */
    public final void mo42257a(antn antn, Comment comment) {
        PlusChimeraService.m68557a();
        DefaultChimeraIntentService.m68555a(this.f77720a, new aobn(this.f77721b, antn, comment));
    }

    /* renamed from: a */
    public final void mo42258a(antn antn, Post post) {
        PlusChimeraService.m68557a();
        DefaultChimeraIntentService.m68555a(this.f77720a, new aobm(this.f77721b, antn, post));
    }

    /* renamed from: a */
    public final void mo42259a(antn antn, String str) {
        this.f77723d.mo42285a(new aoau(antn), str);
    }

    /* renamed from: a */
    public final void mo42260a(antn antn, String str, int i, String str2) {
        PlusChimeraService.m68557a();
        sdo.m34959a(antn);
        sdo.m34975b(!TextUtils.isEmpty(str), "The appId parameter is required.");
        DefaultChimeraIntentService.m68555a(this.f77720a, new aobp(this.f77721b, str, i, str2, antn));
    }

    /* renamed from: a */
    public final void mo42261a(antn antn, String str, int i, String str2, Uri uri, String str3) {
        PlusChimeraService.m68557a();
        DefaultChimeraIntentService.m68555a(this.f77720a, new aobq(this.f77721b, i, str2, uri, str3, "me", str, antn));
    }

    /* renamed from: a */
    public final void mo42262a(antn antn, String str, Audience audience) {
        DefaultChimeraIntentService.m68555a(this.f77720a, new aoci(this.f77721b, str, audience, antn));
    }

    /* renamed from: a */
    public final void mo42263a(antn antn, String str, ApplicationEntity applicationEntity) {
        DefaultChimeraIntentService.m68555a(this.f77720a, new aobf(this.f77721b, str, antn, applicationEntity));
    }

    /* renamed from: a */
    public final void mo42264a(antn antn, String str, ApplicationEntity applicationEntity, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        DefaultChimeraIntentService.m68555a(this.f77720a, new aoch(this.f77721b, str, applicationEntity, list, z, z2, z3, z4, antn));
    }

    /* renamed from: a */
    public final void mo42265a(antn antn, String str, UpgradeAccountEntity upgradeAccountEntity) {
        DefaultChimeraIntentService.m68555a(this.f77720a, new aocm(this.f77721b, str, upgradeAccountEntity, antn));
    }

    /* renamed from: a */
    public final void mo42266a(antn antn, String str, String str2) {
        this.f77723d.mo42286a(new aoau(antn), str, str2);
    }

    /* renamed from: a */
    public final void mo42267a(antn antn, String str, String str2, int i, String str3) {
        PlusChimeraService.m68557a();
        DefaultChimeraIntentService.m68555a(this.f77720a, new aobh(str, str2, i, str3, antn, this.f77722c, aoay.f78058a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002f, code lost:
        if (p000.skh.m35531a().mo25690a(r7.f77720a, new android.content.Intent("com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState").setClassName(r12, "com.google.android.gms.auth.api.signin.RevocationBoundService"), new p000.aoaw(r7, "plus"), 1) == false) goto L_0x003a;
     */
    /* renamed from: a */
    public final void mo42268a(antn antn, String str, String str2, boolean z, String str3) {
        if (str3 != null) {
            ClientContext clientContext = new ClientContext(this.f77721b);
            clientContext.f30216f = str3;
            clientContext.mo17804b(this.f77720a);
            try {
            } catch (SecurityException e) {
                Log.e("PlusService", "Unexpected exception starting RevocationBoundService service", e);
            }
        }
        DefaultChimeraIntentService.m68555a(this.f77720a, new aobe(this.f77721b, str, str2, z, antn));
        DefaultChimeraIntentService.m68555a(this.f77720a, new aobc(str3));
        DefaultChimeraIntentService.m68555a(this.f77720a, new aobe(this.f77721b, str, str2, z, antn));
    }

    /* renamed from: a */
    public final void mo42269a(String str, String str2) {
        PlusChimeraService.m68557a();
        DefaultChimeraIntentService.m68555a(this.f77720a, new aocl(str, str2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x030b  */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        antn antn;
        antn antn2;
        String readString;
        antn antn3;
        antn antn4;
        antn antn5;
        antn antn6 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface instanceof antn) {
                        antn6 = (antn) queryLocalInterface;
                    } else {
                        antn6 = new antl(readStrongBinder);
                    }
                }
                mo42259a(antn6, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface2 instanceof antn) {
                        antn6 = (antn) queryLocalInterface2;
                    } else {
                        antn6 = new antl(readStrongBinder2);
                    }
                }
                mo42266a(antn6, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface3 instanceof antn) {
                        antn6 = (antn) queryLocalInterface3;
                    } else {
                        antn6 = new antl(readStrongBinder3);
                    }
                }
                mo42272b(antn6, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                String a = mo42252a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 5:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface4 instanceof antn) {
                        antn6 = (antn) queryLocalInterface4;
                    } else {
                        antn6 = new antl(readStrongBinder4);
                    }
                }
                mo42274c(antn6, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface5 instanceof antn) {
                        antn6 = (antn) queryLocalInterface5;
                    } else {
                        antn6 = new antl(readStrongBinder5);
                    }
                }
                mo42253a(antn6);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface6 instanceof antn) {
                        antn6 = (antn) queryLocalInterface6;
                    } else {
                        antn6 = new antl(readStrongBinder6);
                    }
                }
                mo42256a(antn6, (Uri) dcl.m8163a(parcel, Uri.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface7 instanceof antn) {
                        antn6 = (antn) queryLocalInterface7;
                    } else {
                        antn6 = new antl(readStrongBinder7);
                    }
                }
                mo42275d(antn6, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 9:
                mo42269a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface8 instanceof antn) {
                        antn = (antn) queryLocalInterface8;
                        mo42267a(antn, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    }
                    antn6 = new antl(readStrongBinder8);
                }
                antn = antn6;
                mo42267a(antn, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface9 instanceof antn) {
                        antn6 = (antn) queryLocalInterface9;
                    } else {
                        antn6 = new antl(readStrongBinder9);
                    }
                }
                mo42255a(antn6, parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface10 instanceof antn) {
                        antn antn7 = (antn) queryLocalInterface10;
                    } else {
                        new antl(readStrongBinder10);
                    }
                }
                dcl.m8167a(parcel);
                dcl.m8167a(parcel);
                throw new IllegalStateException("Not implemented.");
            case 13:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface11 instanceof antn) {
                        antn6 = (antn) queryLocalInterface11;
                    } else {
                        antn6 = new antl(readStrongBinder11);
                    }
                }
                DefaultChimeraIntentService.m68555a(this.f77720a, new aobg(this.f77721b, (AclsRequest) dcl.m8163a(parcel, AclsRequest.CREATOR), antn6));
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface12 instanceof antn) {
                        antn6 = (antn) queryLocalInterface12;
                    } else {
                        antn6 = new antl(readStrongBinder12);
                    }
                }
                mo42263a(antn6, parcel.readString(), (ApplicationEntity) dcl.m8163a(parcel, ApplicationEntity.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface13 instanceof antn) {
                        antn2 = (antn) queryLocalInterface13;
                        String readString2 = parcel.readString();
                        boolean a2 = dcl.m8167a(parcel);
                        readString = parcel.readString();
                        if (readString != null) {
                            DefaultChimeraIntentService.m68555a(this.f77720a, new aobc(readString));
                        }
                        DefaultChimeraIntentService.m68555a(this.f77720a, new aobe(this.f77721b, null, readString2, a2, antn2));
                        parcel2.writeNoException();
                        return true;
                    }
                    antn6 = new antl(readStrongBinder13);
                }
                antn2 = antn6;
                String readString22 = parcel.readString();
                boolean a22 = dcl.m8167a(parcel);
                readString = parcel.readString();
                if (readString != null) {
                }
                DefaultChimeraIntentService.m68555a(this.f77720a, new aobe(this.f77721b, null, readString22, a22, antn2));
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface14 instanceof antn) {
                        antn6 = (antn) queryLocalInterface14;
                    } else {
                        antn6 = new antl(readStrongBinder14);
                    }
                }
                DefaultChimeraIntentService.m68555a(this.f77720a, new aock(this.f77721b, (AclsRequest) dcl.m8163a(parcel, AclsRequest.CREATOR), antn6));
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface15 instanceof antn) {
                        antn6 = (antn) queryLocalInterface15;
                    } else {
                        antn6 = new antl(readStrongBinder15);
                    }
                }
                DefaultChimeraIntentService.m68555a(this.f77720a, new aocj(this.f77721b, (AclsRequest) dcl.m8163a(parcel, AclsRequest.CREATOR), antn6));
                parcel2.writeNoException();
                return true;
            case 18:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface16 instanceof antn) {
                        antn6 = (antn) queryLocalInterface16;
                    } else {
                        antn6 = new antl(readStrongBinder16);
                    }
                }
                mo42262a(antn6, parcel.readString(), (Audience) dcl.m8163a(parcel, Audience.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface17 instanceof antn) {
                        antn3 = (antn) queryLocalInterface17;
                        mo42264a(antn3, parcel.readString(), (ApplicationEntity) dcl.m8163a(parcel, ApplicationEntity.CREATOR), parcel.createTypedArrayList(AudienceMember.CREATOR), dcl.m8167a(parcel), dcl.m8167a(parcel), dcl.m8167a(parcel), dcl.m8167a(parcel));
                        parcel2.writeNoException();
                        return true;
                    }
                    antn6 = new antl(readStrongBinder17);
                }
                antn3 = antn6;
                mo42264a(antn3, parcel.readString(), (ApplicationEntity) dcl.m8163a(parcel, ApplicationEntity.CREATOR), parcel.createTypedArrayList(AudienceMember.CREATOR), dcl.m8167a(parcel), dcl.m8167a(parcel), dcl.m8167a(parcel), dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface18 instanceof antn) {
                        antn6 = (antn) queryLocalInterface18;
                    } else {
                        antn6 = new antl(readStrongBinder18);
                    }
                }
                mo42257a(antn6, (Comment) dcl.m8163a(parcel, Comment.CREATOR));
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface19 instanceof antn) {
                        antn6 = (antn) queryLocalInterface19;
                    } else {
                        antn6 = new antl(readStrongBinder19);
                    }
                }
                mo42258a(antn6, (Post) dcl.m8163a(parcel, Post.CREATOR));
                parcel2.writeNoException();
                return true;
            case 22:
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface20 instanceof antn) {
                        antn6 = (antn) queryLocalInterface20;
                    } else {
                        antn6 = new antl(readStrongBinder20);
                    }
                }
                mo42271b(antn6, (Post) dcl.m8163a(parcel, Post.CREATOR));
                parcel2.writeNoException();
                return true;
            case 23:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface21 instanceof antn) {
                        antn6 = (antn) queryLocalInterface21;
                    } else {
                        antn6 = new antl(readStrongBinder21);
                    }
                }
                mo42273c(antn6, (Post) dcl.m8163a(parcel, Post.CREATOR));
                parcel2.writeNoException();
                return true;
            case 24:
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface22 instanceof antn) {
                        antn4 = (antn) queryLocalInterface22;
                        mo42261a(antn4, parcel.readString(), parcel.readInt(), parcel.readString(), (Uri) dcl.m8163a(parcel, Uri.CREATOR), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    }
                    antn6 = new antl(readStrongBinder22);
                }
                antn4 = antn6;
                mo42261a(antn4, parcel.readString(), parcel.readInt(), parcel.readString(), (Uri) dcl.m8163a(parcel, Uri.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 25:
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface23 instanceof antn) {
                        antn6 = (antn) queryLocalInterface23;
                    } else {
                        antn6 = new antl(readStrongBinder23);
                    }
                }
                mo42276e(antn6, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface24 instanceof antn) {
                        antn6 = (antn) queryLocalInterface24;
                    } else {
                        antn6 = new antl(readStrongBinder24);
                    }
                }
                mo42277f(antn6, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 27:
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface25 instanceof antn) {
                        antn6 = (antn) queryLocalInterface25;
                    } else {
                        antn6 = new antl(readStrongBinder25);
                    }
                }
                mo42260a(antn6, parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 28:
                IBinder readStrongBinder26 = parcel.readStrongBinder();
                if (readStrongBinder26 != null) {
                    IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface26 instanceof antn) {
                        antn5 = (antn) queryLocalInterface26;
                        mo42268a(antn5, parcel.readString(), parcel.readString(), dcl.m8167a(parcel), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    }
                    antn6 = new antl(readStrongBinder26);
                }
                antn5 = antn6;
                mo42268a(antn5, parcel.readString(), parcel.readString(), dcl.m8167a(parcel), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 29:
                IBinder readStrongBinder27 = parcel.readStrongBinder();
                if (readStrongBinder27 != null) {
                    IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface27 instanceof antn) {
                        antn6 = (antn) queryLocalInterface27;
                    } else {
                        antn6 = new antl(readStrongBinder27);
                    }
                }
                mo42254a(antn6, parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 30:
                IBinder readStrongBinder28 = parcel.readStrongBinder();
                if (readStrongBinder28 != null) {
                    IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface28 instanceof antn) {
                        antn6 = (antn) queryLocalInterface28;
                    } else {
                        antn6 = new antl(readStrongBinder28);
                    }
                }
                mo42265a(antn6, parcel.readString(), (UpgradeAccountEntity) dcl.m8163a(parcel, UpgradeAccountEntity.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                IBinder readStrongBinder29 = parcel.readStrongBinder();
                if (readStrongBinder29 != null) {
                    IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
                    if (queryLocalInterface29 instanceof antn) {
                        antn6 = (antn) queryLocalInterface29;
                    } else {
                        antn6 = new antl(readStrongBinder29);
                    }
                }
                mo42270b(antn6, parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
