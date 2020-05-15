package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.internal.model.acls.AclsResponse;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;

/* renamed from: antl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class antl extends dcj implements antn {
    public antl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusInternalCallbacks");
    }

    /* renamed from: a */
    public final void mo42237a(int i, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        mo8528b(12, bj);
    }

    /* renamed from: b */
    public final void mo42251b(int i, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, (Parcelable) null);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo41924a(int i, Bundle bundle, Bundle bundle2) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, bundle2);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo42238a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, parcelFileDescriptor);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo42239a(int i, Bundle bundle, AclsResponse aclsResponse) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, aclsResponse);
        mo8528b(20, bj);
    }

    /* renamed from: a */
    public final void mo42240a(int i, Bundle bundle, AppAclsEntity appAclsEntity) {
        Parcel bj = mo8529bj();
        bj.writeInt(0);
        dcl.m8165a(bj, (Parcelable) null);
        dcl.m8165a(bj, appAclsEntity);
        mo8528b(24, bj);
    }

    /* renamed from: a */
    public final void mo42241a(int i, Bundle bundle, Comment comment) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, comment);
        mo8528b(21, bj);
    }

    /* renamed from: a */
    public final void mo42242a(int i, Bundle bundle, Post post) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, post);
        mo8528b(13, bj);
    }

    /* renamed from: a */
    public final void mo42243a(int i, Bundle bundle, Settings settings) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, settings);
        mo8528b(14, bj);
    }

    /* renamed from: a */
    public final void mo42244a(int i, Bundle bundle, MomentsFeed momentsFeed) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, momentsFeed);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo42245a(int i, Bundle bundle, PeopleFeed peopleFeed) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, peopleFeed);
        mo8528b(19, bj);
    }

    /* renamed from: a */
    public final void mo42246a(int i, Bundle bundle, UpgradeAccountEntity upgradeAccountEntity) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, upgradeAccountEntity);
        mo8528b(18, bj);
    }

    /* renamed from: a */
    public final void mo42247a(int i, Bundle bundle, String str) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        bj.writeString(str);
        mo8528b(15, bj);
    }

    /* renamed from: a */
    public final void mo42248a(int i, Bundle bundle, String str, AppAclsEntity appAclsEntity) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        bj.writeString(str);
        dcl.m8165a(bj, appAclsEntity);
        mo8528b(11, bj);
    }

    /* renamed from: a */
    public final void mo42249a(int i, Bundle bundle, List list) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        bj.writeTypedList(list);
        mo8528b(16, bj);
    }

    /* renamed from: a */
    public final void mo42250a(DataHolder dataHolder, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        bj.writeString(str);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo41922a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8528b(3, bj);
    }
}
