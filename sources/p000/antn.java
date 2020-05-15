package p000;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
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

/* renamed from: antn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface antn extends IInterface {
    /* renamed from: a */
    void mo42237a(int i, Bundle bundle);

    /* renamed from: a */
    void mo41924a(int i, Bundle bundle, Bundle bundle2);

    /* renamed from: a */
    void mo42238a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor);

    /* renamed from: a */
    void mo42239a(int i, Bundle bundle, AclsResponse aclsResponse);

    /* renamed from: a */
    void mo42240a(int i, Bundle bundle, AppAclsEntity appAclsEntity);

    /* renamed from: a */
    void mo42241a(int i, Bundle bundle, Comment comment);

    /* renamed from: a */
    void mo42242a(int i, Bundle bundle, Post post);

    /* renamed from: a */
    void mo42243a(int i, Bundle bundle, Settings settings);

    /* renamed from: a */
    void mo42244a(int i, Bundle bundle, MomentsFeed momentsFeed);

    /* renamed from: a */
    void mo42245a(int i, Bundle bundle, PeopleFeed peopleFeed);

    /* renamed from: a */
    void mo42246a(int i, Bundle bundle, UpgradeAccountEntity upgradeAccountEntity);

    /* renamed from: a */
    void mo42247a(int i, Bundle bundle, String str);

    /* renamed from: a */
    void mo42248a(int i, Bundle bundle, String str, AppAclsEntity appAclsEntity);

    /* renamed from: a */
    void mo42249a(int i, Bundle bundle, List list);

    /* renamed from: a */
    void mo42250a(DataHolder dataHolder, String str);

    /* renamed from: a */
    void mo41922a(String str);

    /* renamed from: b */
    void mo42251b(int i, Bundle bundle);
}
