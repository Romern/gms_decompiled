package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;

/* renamed from: antq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface antq extends IInterface {
    /* renamed from: a */
    String mo42252a();

    /* renamed from: a */
    void mo42253a(antn antn);

    /* renamed from: a */
    void mo42254a(antn antn, int i, int i2, String str);

    /* renamed from: a */
    void mo42255a(antn antn, int i, String str);

    /* renamed from: a */
    void mo42256a(antn antn, Uri uri, Bundle bundle);

    /* renamed from: a */
    void mo42257a(antn antn, Comment comment);

    /* renamed from: a */
    void mo42258a(antn antn, Post post);

    /* renamed from: a */
    void mo42259a(antn antn, String str);

    /* renamed from: a */
    void mo42260a(antn antn, String str, int i, String str2);

    /* renamed from: a */
    void mo42261a(antn antn, String str, int i, String str2, Uri uri, String str3);

    /* renamed from: a */
    void mo42262a(antn antn, String str, Audience audience);

    /* renamed from: a */
    void mo42263a(antn antn, String str, ApplicationEntity applicationEntity);

    /* renamed from: a */
    void mo42264a(antn antn, String str, ApplicationEntity applicationEntity, List list, boolean z, boolean z2, boolean z3, boolean z4);

    /* renamed from: a */
    void mo42265a(antn antn, String str, UpgradeAccountEntity upgradeAccountEntity);

    /* renamed from: a */
    void mo42266a(antn antn, String str, String str2);

    /* renamed from: a */
    void mo42267a(antn antn, String str, String str2, int i, String str3);

    /* renamed from: a */
    void mo42268a(antn antn, String str, String str2, boolean z, String str3);

    /* renamed from: a */
    void mo42269a(String str, String str2);

    /* renamed from: b */
    void mo42270b(antn antn, int i, int i2, String str);

    /* renamed from: b */
    void mo42271b(antn antn, Post post);

    /* renamed from: b */
    void mo42272b(antn antn, String str);

    /* renamed from: c */
    void mo42273c(antn antn, Post post);

    /* renamed from: c */
    void mo42274c(antn antn, String str);

    /* renamed from: d */
    void mo42275d(antn antn, String str);

    /* renamed from: e */
    void mo42276e(antn antn, String str);

    /* renamed from: f */
    void mo42277f(antn antn, String str);
}
