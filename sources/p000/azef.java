package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;

/* renamed from: azef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azef {

    /* renamed from: a */
    public final Context f99150a;

    /* renamed from: b */
    public final azcl f99151b;

    /* renamed from: c */
    public final azfo f99152c;

    /* renamed from: d */
    public final azdm f99153d;

    /* renamed from: e */
    public final MessagingService f99154e;

    /* renamed from: f */
    public final long f99155f = cfeo.f183719a.mo6606a().mo81012bS();

    /* renamed from: g */
    public final azfx f99156g;

    /* renamed from: h */
    public final azbx f99157h;

    /* renamed from: i */
    public final azcv f99158i;

    /* renamed from: j */
    public final sqv f99159j;

    public azef(Context context, azcl azcl, azfo azfo, MessagingService messagingService, azfx azfx, azdm azdm, sqv sqv, azcv azcv) {
        this.f99154e = messagingService;
        this.f99150a = context;
        this.f99151b = azcl;
        this.f99152c = azfo;
        this.f99153d = azdm;
        this.f99156g = azfx;
        this.f99159j = sqv;
        this.f99157h = azbx.m85232a(context);
        this.f99158i = azcv;
    }

    /* renamed from: a */
    public final LocalEntityId mo54824a() {
        if (azdl.m85419g(this.f99150a)) {
            return new LocalEntityId(azdl.m85414b(this.f99150a), 1, "MS");
        }
        return azcv.f99014b;
    }

    /* renamed from: a */
    public final void mo54825a(int i, String str, Intent intent) {
        new azhr(this.f99150a, this.f99156g, str, i, intent, this.f99152c, this.f99151b, this.f99157h, this.f99158i).mo54921a();
    }

    /* renamed from: a */
    public final void mo54826a(LocalEntityId localEntityId) {
        new azhf(this.f99150a, this.f99156g, localEntityId).mo54921a();
    }

    /* renamed from: a */
    public final void mo54827a(LocalEntityId localEntityId, LocalEntityId localEntityId2, Intent intent) {
        new azhe(this.f99150a, this.f99156g, this.f99152c, this.f99158i, intent, this.f99151b, localEntityId2, localEntityId).mo54921a();
    }

    /* renamed from: a */
    public final void mo54828a(String str, Intent intent) {
        new azhh(this.f99150a, this.f99156g, str, intent, this.f99154e).mo54921a();
    }
}
