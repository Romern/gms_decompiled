package p000;

import com.google.android.libraries.bluetooth.fastpair.Event;

/* renamed from: ahts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahts {

    /* renamed from: a */
    private final ahti f68027a;

    public ahts(ahti ahti) {
        this.f68027a = ahti;
    }

    /* renamed from: b */
    private final void m56643b(Event event) {
        ahti ahti = this.f68027a;
        ahtg f = ahth.m56604f();
        f.mo37114a(event.mo60332a());
        f.mo37113a(event.mo60333b());
        f.f67983a = event.mo60336e();
        bxvd b = ahti.mo37125b(f.mo37111a());
        if (event.mo60332a() == bvjc.CONNECT_PROFILE && event.mo60334c() != null) {
            bxvd da = bvet.f155791d.mo74144da();
            short shortValue = event.mo60334c().shortValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvet bvet = (bvet) da.f164949b;
            bvet.f155793a |= 2;
            bvet.f155795c = shortValue;
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bvey bvey = (bvey) b.f164949b;
            bvet bvet2 = (bvet) da.mo74062i();
            bvey bvey2 = bvey.f155813m;
            bvet2.getClass();
            bvey.f155822h = bvet2;
            bvey.f155815a |= 64;
        }
        if (event.mo60335d() != null) {
            this.f68027a.f67989b = event.mo60335d();
        }
    }

    /* renamed from: a */
    public final void mo37156a(Event event) {
        m56643b(event);
        this.f68027a.mo37126b();
    }

    /* renamed from: a */
    public final void mo37157a(Event event, Exception exc) {
        m56643b(event);
        this.f68027a.mo37123a(exc);
    }
}
