package p000;

import android.content.Context;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: alpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alpb extends alot {

    /* renamed from: a */
    private final AvatarReference f73998a;

    /* renamed from: b */
    private final ParcelableLoadImageOptions f73999b;

    /* renamed from: s */
    private alot f74000s;

    public alpb(String str, int i, almp almp, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        super(str, null, i, almp, "LoadAvatarByReference");
        this.f73998a = avatarReference;
        this.f73999b = parcelableLoadImageOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40608a() {
        String valueOf = String.valueOf(this.f73998a);
        String valueOf2 = String.valueOf(this.f73999b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + String.valueOf(valueOf2).length());
        sb.append("[avref: ref=");
        sb.append(valueOf);
        sb.append(" opts=");
        sb.append(valueOf2);
        sb.append("]");
        sb.toString();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final alos mo40609c(Context context) {
        String str = this.f75728i;
        int i = this.f75729j;
        almp almp = this.f73988g;
        AvatarReference avatarReference = this.f73998a;
        ParcelableLoadImageOptions parcelableLoadImageOptions = this.f73999b;
        amig.m62939a();
        alot alot = null;
        if (((Boolean) amgj.f74886a.mo41191a()).booleanValue()) {
            if (avatarReference.mo46360a()) {
                avatarReference = ameu.m62831c(avatarReference);
            }
            switch (avatarReference.f81939a) {
                case 1:
                    alot = alpe.m61455a(context, str, i, almp, avatarReference.f81941c, parcelableLoadImageOptions);
                    break;
                case 2:
                    alot = alpe.m61456a(context, str, i, almp, avatarReference.f81942d, avatarReference, parcelableLoadImageOptions);
                    break;
                case 3:
                    alot = alpe.m61454a(context, str, i, almp, avatarReference.f81942d, avatarReference.f81945g.longValue(), parcelableLoadImageOptions);
                    break;
                case 4:
                    if (cgaa.m144067e()) {
                        sdo.m34975b(false, "This avatar reference is not used based on code search and our logging; If you believe that your service still have a valid use case, please contact us at menagerie-eng@google.com. ");
                        break;
                    } else {
                        alot = alpe.m61460b(context, str, i, almp, avatarReference.f81942d, avatarReference, parcelableLoadImageOptions);
                        break;
                    }
                case 5:
                    amig.m62939a();
                    if (!((Boolean) amhq.f74919a.mo41191a()).booleanValue()) {
                        alot = alpe.m61458a(str, i, almp, avatarReference.f81941c, parcelableLoadImageOptions);
                        break;
                    }
                    alot = alpe.m61455a(context, str, i, almp, avatarReference.f81941c, parcelableLoadImageOptions);
                    break;
                case 6:
                    if (cgaa.m144068f()) {
                        sdo.m34975b(false, "This avatar reference is not used based on code search and our logging; If you believe that your service still have a valid use case, please contact us at menagerie-eng@google.com. ");
                        break;
                    } else {
                        alot = alpe.m61457a(str, i, almp, avatarReference.f81946h.longValue(), parcelableLoadImageOptions);
                        break;
                    }
                default:
                    sdo.m34975b(false, "Unsupported avatar reference");
                    break;
            }
        } else {
            switch (avatarReference.f81939a) {
                case 1:
                    alot = alpe.m61455a(context, str, i, almp, avatarReference.f81940b, parcelableLoadImageOptions);
                    break;
                case 2:
                    sdo.m34959a(avatarReference);
                    alot = alpe.m61456a(context, str, i, almp, ameu.m62836g(avatarReference.f81939a, avatarReference.f81940b), avatarReference, parcelableLoadImageOptions);
                    break;
                case 3:
                    sdo.m34959a(avatarReference);
                    String j = ameu.m62839j(avatarReference.f81939a, avatarReference.f81940b);
                    sdo.m34959a(avatarReference);
                    alot = alpe.m61454a(context, str, i, almp, j, ameu.m62837h(avatarReference.f81939a, avatarReference.f81940b), parcelableLoadImageOptions);
                    break;
                case 4:
                    if (!cgaa.m144067e()) {
                        sdo.m34959a(avatarReference);
                        alot = alpe.m61460b(context, str, i, almp, ameu.m62832c(avatarReference.f81939a, avatarReference.f81940b), avatarReference, parcelableLoadImageOptions);
                        break;
                    } else {
                        sdo.m34975b(false, "This avatar reference is not used based on code search and our logging; If you believe that your service still have a valid use case, please contact us at menagerie-eng@google.com. ");
                        break;
                    }
                case 5:
                    amig.m62939a();
                    if (!((Boolean) amhq.f74919a.mo41191a()).booleanValue()) {
                        alot = alpe.m61458a(str, i, almp, avatarReference.f81940b, parcelableLoadImageOptions);
                        break;
                    }
                    alot = alpe.m61455a(context, str, i, almp, avatarReference.f81940b, parcelableLoadImageOptions);
                    break;
                case 6:
                    if (!cgaa.m144068f()) {
                        sdo.m34959a(avatarReference);
                        alot = alpe.m61457a(str, i, almp, ameu.m62838i(avatarReference.f81939a, avatarReference.f81940b), parcelableLoadImageOptions);
                        break;
                    } else {
                        sdo.m34975b(false, "This avatar reference is not used based on code search and our logging; If you believe that your service still have a valid use case, please contact us at menagerie-eng@google.com. ");
                        break;
                    }
                default:
                    sdo.m34975b(false, "Unsupported avatar reference");
                    break;
            }
        }
        this.f74000s = alot;
        return alot.mo40609c(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40627a(boolean z) {
        alot alot = this.f74000s;
        if (alot != null) {
            alot.mo41261b(z);
        }
    }
}
