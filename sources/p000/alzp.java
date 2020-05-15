package p000;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

/* renamed from: alzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface alzp extends IInterface {
    /* renamed from: a */
    Bundle mo40540a(alzm alzm, boolean z, String str, String str2, int i);

    /* renamed from: a */
    Bundle mo40541a(String str, String str2);

    /* renamed from: a */
    Bundle mo40542a(String str, String str2, long j);

    /* renamed from: a */
    Bundle mo40543a(String str, String str2, long j, boolean z);

    /* renamed from: a */
    Bundle mo40544a(String str, String str2, long j, boolean z, boolean z2);

    /* renamed from: a */
    sce mo40545a(alzm alzm, AccountToken accountToken, ParcelableListOptions parcelableListOptions);

    /* renamed from: a */
    sce mo40546a(alzm alzm, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions);

    /* renamed from: a */
    sce mo40547a(alzm alzm, String str);

    /* renamed from: a */
    sce mo40548a(alzm alzm, String str, int i);

    /* renamed from: a */
    sce mo40549a(alzm alzm, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2);

    /* renamed from: a */
    void mo40551a(alzm alzm, Account account, String str);

    /* renamed from: a */
    void mo40552a(alzm alzm, Uri uri);

    /* renamed from: a */
    void mo40553a(alzm alzm, Uri uri, String str);

    /* renamed from: a */
    void mo40554a(alzm alzm, Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    /* renamed from: a */
    void mo40555a(alzm alzm, Bundle bundle);

    /* renamed from: a */
    void mo40556a(alzm alzm, AccountToken accountToken, List list, ParcelableGetOptions parcelableGetOptions);

    /* renamed from: a */
    void mo40557a(alzm alzm, String str, int i, int i2);

    /* renamed from: a */
    void mo40558a(alzm alzm, String str, String str2);

    /* renamed from: a */
    void mo40559a(alzm alzm, String str, String str2, int i);

    /* renamed from: a */
    void mo40560a(alzm alzm, String str, String str2, int i, int i2);

    /* renamed from: a */
    void mo40561a(alzm alzm, String str, String str2, Uri uri);

    /* renamed from: a */
    void mo40562a(alzm alzm, String str, String str2, Uri uri, boolean z);

    /* renamed from: a */
    void mo40563a(alzm alzm, String str, String str2, String str3);

    /* renamed from: a */
    void mo40564a(alzm alzm, String str, String str2, String str3, int i, String str4);

    /* renamed from: a */
    void mo40565a(alzm alzm, String str, String str2, String str3, int i, String str4, boolean z);

    /* renamed from: a */
    void mo40566a(alzm alzm, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4);

    /* renamed from: a */
    void mo40567a(alzm alzm, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2);

    /* renamed from: a */
    void mo40568a(alzm alzm, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5);

    /* renamed from: a */
    void mo40569a(alzm alzm, String str, String str2, String str3, List list);

    /* renamed from: a */
    void mo40570a(alzm alzm, String str, String str2, String str3, List list, int i, boolean z, long j);

    /* renamed from: a */
    void mo40571a(alzm alzm, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2);

    /* renamed from: a */
    void mo40572a(alzm alzm, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2, int i3);

    /* renamed from: a */
    void mo40573a(alzm alzm, String str, String str2, String str3, List list, int i, boolean z, long j, String str4, int i2, int i3, int i4);

    /* renamed from: a */
    void mo40574a(alzm alzm, String str, String str2, String str3, List list, List list2, FavaDiagnosticsEntity favaDiagnosticsEntity);

    /* renamed from: a */
    void mo40575a(alzm alzm, String str, String str2, String str3, boolean z, int i);

    /* renamed from: a */
    void mo40576a(alzm alzm, String str, String str2, String str3, boolean z, int i, int i2);

    /* renamed from: a */
    void mo40577a(alzm alzm, String str, String str2, String[] strArr);

    /* renamed from: a */
    void mo40578a(alzm alzm, boolean z, boolean z2, String str, String str2);

    /* renamed from: a */
    void mo40579a(alzm alzm, boolean z, boolean z2, String str, String str2, int i);

    /* renamed from: b */
    Bundle mo40580b(String str, String str2);

    /* renamed from: b */
    sce mo40581b(alzm alzm, String str, int i, int i2);

    /* renamed from: b */
    sce mo40582b(alzm alzm, String str, String str2, int i, int i2);

    /* renamed from: b */
    void mo40583b();

    /* renamed from: b */
    void mo40584b(alzm alzm, Account account, String str);

    /* renamed from: b */
    void mo40585b(alzm alzm, String str);

    /* renamed from: b */
    void mo40586b(alzm alzm, String str, String str2);

    /* renamed from: b */
    void mo40587b(alzm alzm, String str, String str2, int i);

    /* renamed from: b */
    void mo40588b(alzm alzm, String str, String str2, String str3, int i, String str4);

    /* renamed from: c */
    sce mo40589c(alzm alzm, String str, String str2, int i);

    /* renamed from: c */
    void mo40590c();

    /* renamed from: c */
    void mo40591c(alzm alzm, Account account, String str);

    /* renamed from: c */
    void mo40592c(alzm alzm, String str, String str2);

    /* renamed from: d */
    void mo40593d(alzm alzm, Account account, String str);

    /* renamed from: d */
    void mo40594d(alzm alzm, String str, String str2);

    /* renamed from: e */
    sce mo40595e(alzm alzm, String str, String str2);
}
