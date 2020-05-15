package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.internal.model.acls.AclsResponse;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;

/* renamed from: antm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class antm extends dck implements antn {
    public antm() {
        super("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
    }

    /* renamed from: a */
    public void mo42237a(int i, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo41924a(int i, Bundle bundle, Bundle bundle2) {
    }

    /* renamed from: a */
    public void mo42238a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
    }

    /* renamed from: a */
    public final void mo42239a(int i, Bundle bundle, AclsResponse aclsResponse) {
    }

    /* renamed from: a */
    public void mo42240a(int i, Bundle bundle, AppAclsEntity appAclsEntity) {
    }

    /* renamed from: a */
    public void mo42241a(int i, Bundle bundle, Comment comment) {
    }

    /* renamed from: a */
    public void mo42242a(int i, Bundle bundle, Post post) {
    }

    /* renamed from: a */
    public void mo42243a(int i, Bundle bundle, Settings settings) {
    }

    /* renamed from: a */
    public void mo42244a(int i, Bundle bundle, MomentsFeed momentsFeed) {
    }

    /* renamed from: a */
    public void mo42245a(int i, Bundle bundle, PeopleFeed peopleFeed) {
    }

    /* renamed from: a */
    public void mo42246a(int i, Bundle bundle, UpgradeAccountEntity upgradeAccountEntity) {
    }

    /* renamed from: a */
    public void mo42247a(int i, Bundle bundle, String str) {
    }

    /* renamed from: a */
    public void mo42248a(int i, Bundle bundle, String str, AppAclsEntity appAclsEntity) {
    }

    /* renamed from: a */
    public void mo42249a(int i, Bundle bundle, List list) {
    }

    /* renamed from: a */
    public void mo42250a(DataHolder dataHolder, String str) {
    }

    /* renamed from: a */
    public void mo41922a(String str) {
    }

    /* renamed from: b */
    public void mo42251b(int i, Bundle bundle) {
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo41924a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                break;
            case 2:
                mo42238a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR));
                break;
            case 3:
                mo41922a(parcel.readString());
                break;
            case 4:
            case 5:
            case 7:
            case 17:
            case 22:
            case 23:
            default:
                return false;
            case 6:
                mo42244a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (MomentsFeed) dcl.m8163a(parcel, MomentsFeed.CREATOR));
                break;
            case 8:
                mo42250a((DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR), parcel.readString());
                break;
            case 9:
                Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                mo42251b(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                break;
            case 10:
                parcel.readInt();
                Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                parcel.readString();
                parcel.createStringArrayList();
                parcel.createStringArrayList();
                parcel.createStringArrayList();
                break;
            case 11:
                mo42248a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), parcel.readString(), (AppAclsEntity) dcl.m8163a(parcel, AppAclsEntity.CREATOR));
                break;
            case 12:
                mo42237a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                break;
            case 13:
                mo42242a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (Post) dcl.m8163a(parcel, Post.CREATOR));
                break;
            case 14:
                mo42243a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (Settings) dcl.m8163a(parcel, Settings.CREATOR));
                break;
            case 15:
                mo42247a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), parcel.readString());
                break;
            case 16:
                mo42249a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), parcel.createTypedArrayList(AudienceMember.CREATOR));
                break;
            case 18:
                mo42246a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (UpgradeAccountEntity) dcl.m8163a(parcel, UpgradeAccountEntity.CREATOR));
                break;
            case 19:
                mo42245a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (PeopleFeed) dcl.m8163a(parcel, PeopleFeed.CREATOR));
                break;
            case 20:
                parcel.readInt();
                Bundle bundle3 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                AclsResponse aclsResponse = (AclsResponse) dcl.m8163a(parcel, AclsResponse.CREATOR);
                break;
            case 21:
                mo42241a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (Comment) dcl.m8163a(parcel, Comment.CREATOR));
                break;
            case 24:
                mo42240a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR), (AppAclsEntity) dcl.m8163a(parcel, AppAclsEntity.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
