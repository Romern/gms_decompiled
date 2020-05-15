package p000;

import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aoex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoex {

    /* renamed from: a */
    public ActivityEntity.ObjectEntity.AttachmentsEntity.ActionEntity f78272a;

    /* renamed from: b */
    public String f78273b;

    /* renamed from: c */
    public ActivityEntity.ObjectEntity.AttachmentsEntity.DeepLinkEntity f78274c;

    /* renamed from: d */
    public String f78275d;

    /* renamed from: e */
    public ActivityEntity.ObjectEntity.AttachmentsEntity.ImageEntity f78276e;

    /* renamed from: f */
    public String f78277f;

    /* renamed from: g */
    public final Set f78278g = new HashSet();

    /* renamed from: h */
    private String f78279h;

    /* renamed from: a */
    public final aofa mo42649a() {
        return new ActivityEntity.ObjectEntity.AttachmentsEntity(this.f78278g, this.f78272a, this.f78273b, this.f78274c, this.f78275d, this.f78276e, this.f78277f, this.f78279h);
    }

    /* renamed from: a */
    public final void mo42650a(String str) {
        this.f78279h = str;
        this.f78278g.add(14);
    }
}
