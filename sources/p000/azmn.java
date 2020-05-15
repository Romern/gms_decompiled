package p000;

import org.json.JSONObject;

/* renamed from: azmn */
final /* synthetic */ class azmn implements Runnable {

    /* renamed from: a */
    private final azmx f99649a;

    /* renamed from: b */
    private final String f99650b;

    /* renamed from: c */
    private final bmxv f99651c;

    public azmn(azmx azmx, String str, bmxv bmxv) {
        this.f99649a = azmx;
        this.f99650b = str;
        this.f99651c = bmxv;
    }

    public final void run() {
        azmx azmx = this.f99649a;
        azmx.f99669c.getContact(this.f99650b, azmx.m85837a((JSONObject) this.f99651c.mo66814b()));
    }
}
