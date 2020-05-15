package p000;

import android.telecom.AudioState;
import java.lang.reflect.Field;

/* renamed from: nhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nhl {

    /* renamed from: a */
    private static Field f35645a;

    /* renamed from: b */
    private static Field f35646b;

    /* renamed from: c */
    private static Field f35647c;

    /* renamed from: d */
    private final AudioState f35648d;

    static {
        try {
            AudioState.class.getMethod("isMuted", new Class[0]);
        } catch (NoSuchMethodException e) {
            try {
                f35645a = AudioState.class.getField("isMuted");
            } catch (NoSuchFieldException | SecurityException e2) {
            }
        }
        try {
            AudioState.class.getMethod("getSupportedRouteMask", new Class[0]);
        } catch (NoSuchMethodException e3) {
            try {
                f35646b = AudioState.class.getField("supportedRouteMask");
            } catch (NoSuchFieldException | SecurityException e4) {
            }
        }
        try {
            AudioState.class.getMethod("getRoute", new Class[0]);
        } catch (NoSuchMethodException e5) {
            try {
                f35647c = AudioState.class.getField("route");
            } catch (NoSuchFieldException | SecurityException e6) {
            }
        }
    }

    public nhl(AudioState audioState) {
        this.f35648d = audioState;
    }

    /* renamed from: a */
    public final boolean mo20683a() {
        try {
            return f35645a != null ? f35645a.getBoolean(this.f35648d) : this.f35648d.isMuted();
        } catch (IllegalAccessException | IllegalArgumentException e) {
            return false;
        }
    }

    /* renamed from: b */
    public final int mo20684b() {
        try {
            if (f35646b != null) {
                return f35646b.getInt(this.f35648d);
            }
            return this.f35648d.getSupportedRouteMask();
        } catch (IllegalAccessException | IllegalArgumentException e) {
            return 0;
        }
    }

    /* renamed from: c */
    public final int mo20685c() {
        try {
            return f35647c != null ? f35647c.getInt(this.f35648d) : this.f35648d.getRoute();
        } catch (IllegalAccessException | IllegalArgumentException e) {
            return 0;
        }
    }
}
