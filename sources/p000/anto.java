package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;

/* renamed from: anto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anto extends dcj implements antq {
    public anto(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusInternalService");
    }

    /* renamed from: a */
    public final String mo42252a() {
        Parcel a = mo8526a(4, mo8529bj());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final void mo42270b(antn antn, int i, int i2, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeInt(i);
        bj.writeInt(i2);
        bj.writeString(str);
        mo8528b(31, bj);
    }

    /* renamed from: c */
    public final void mo42273c(antn antn, Post post) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        dcl.m8165a(bj, post);
        mo8528b(23, bj);
    }

    /* renamed from: d */
    public final void mo42275d(antn antn, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        mo8528b(8, bj);
    }

    /* renamed from: e */
    public final void mo42276e(antn antn, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        mo8528b(25, bj);
    }

    /* renamed from: f */
    public final void mo42277f(antn antn, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        mo8528b(26, bj);
    }

    /* renamed from: a */
    public final void mo42253a(antn antn) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        mo8528b(6, bj);
    }

    /* renamed from: b */
    public final void mo42271b(antn antn, Post post) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        dcl.m8165a(bj, post);
        mo8528b(22, bj);
    }

    /* renamed from: c */
    public final void mo42274c(antn antn, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo42254a(antn antn, int i, int i2, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeInt(0);
        bj.writeInt(i2);
        bj.writeString(str);
        mo8528b(29, bj);
    }

    /* renamed from: b */
    public final void mo42272b(antn antn, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo42255a(antn antn, int i, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeInt(i);
        bj.writeString(str);
        mo8528b(11, bj);
    }

    /* renamed from: a */
    public final void mo42256a(antn antn, Uri uri, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        dcl.m8165a(bj, uri);
        dcl.m8165a(bj, bundle);
        mo8528b(7, bj);
    }

    /* renamed from: a */
    public final void mo42257a(antn antn, Comment comment) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        dcl.m8165a(bj, comment);
        mo8528b(20, bj);
    }

    /* renamed from: a */
    public final void mo42258a(antn antn, Post post) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        dcl.m8165a(bj, post);
        mo8528b(21, bj);
    }

    /* renamed from: a */
    public final void mo42259a(antn antn, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo42260a(antn antn, String str, int i, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        bj.writeInt(i);
        bj.writeString(str2);
        mo8528b(27, bj);
    }

    /* renamed from: a */
    public final void mo42261a(antn antn, String str, int i, String str2, Uri uri, String str3) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        bj.writeInt(i);
        bj.writeString(str2);
        dcl.m8165a(bj, (Parcelable) null);
        bj.writeString(null);
        mo8528b(24, bj);
    }

    /* renamed from: a */
    public final void mo42262a(antn antn, String str, Audience audience) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        dcl.m8165a(bj, audience);
        mo8528b(18, bj);
    }

    /* renamed from: a */
    public final void mo42263a(antn antn, String str, ApplicationEntity applicationEntity) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        dcl.m8165a(bj, applicationEntity);
        mo8528b(14, bj);
    }

    /* renamed from: a */
    public final void mo42264a(antn antn, String str, ApplicationEntity applicationEntity, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        dcl.m8165a(bj, applicationEntity);
        bj.writeTypedList(list);
        dcl.m8166a(bj, z);
        dcl.m8166a(bj, z2);
        dcl.m8166a(bj, z3);
        dcl.m8166a(bj, z4);
        mo8528b(19, bj);
    }

    /* renamed from: a */
    public final void mo42265a(antn antn, String str, UpgradeAccountEntity upgradeAccountEntity) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        dcl.m8165a(bj, upgradeAccountEntity);
        mo8528b(30, bj);
    }

    /* renamed from: a */
    public final void mo42266a(antn antn, String str, String str2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo42267a(antn antn, String str, String str2, int i, String str3) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeInt(i);
        bj.writeString(str3);
        mo8528b(10, bj);
    }

    /* renamed from: a */
    public final void mo42268a(antn antn, String str, String str2, boolean z, String str3) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, antn);
        bj.writeString(str);
        bj.writeString(str2);
        dcl.m8166a(bj, z);
        bj.writeString(str3);
        mo8528b(28, bj);
    }

    /* renamed from: a */
    public final void mo42269a(String str, String str2) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        mo8528b(9, bj);
    }
}
