package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: agkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agkl implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ agkm f65807a;

    public agkl(agkm agkm) {
        this.f65807a = agkm;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        agkm agkm;
        String str;
        try {
            this.f65807a.mo35497E().f65572k.mo35435a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                agkm = this.f65807a;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f65807a.mo35540x();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
                            str = "gs";
                        } else {
                            str = "auto";
                        }
                        this.f65807a.mo35498F().mo35492a(new agkk(this, bundle == null, data, str, data.getQueryParameter("referrer")));
                        agkm = this.f65807a;
                    }
                }
                agkm = this.f65807a;
            }
        } catch (Exception e) {
            this.f65807a.mo35497E().f65564c.mo35436a("Throwable caught in onActivityCreated", e);
            agkm = this.f65807a;
        } catch (Throwable th) {
            this.f65807a.mo35236c().mo35595a(activity, bundle);
            throw th;
        }
        agkm.mo35236c().mo35595a(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        agkw c = this.f65807a.mo35236c();
        if (c.mo35538v().mo35326g().booleanValue()) {
            c.f65834e.remove(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        agkw c = this.f65807a.mo35236c();
        if (c.mo35538v().mo35326g().booleanValue()) {
            agkt a = c.mo35593a(activity);
            c.f65833d = c.f65832c;
            c.f65832c = null;
            c.mo35498F().mo35492a(new agkv(c, a, c.mo35534A().mo20506b()));
        }
        agmb a2 = this.f65807a.mo35234a();
        a2.mo35498F().mo35492a(new aglu(a2, a2.mo35534A().mo20506b()));
    }

    public final void onActivityResumed(Activity activity) {
        agkt agkt;
        String str;
        agmb a = this.f65807a.mo35234a();
        a.mo35498F().mo35492a(new aglt(a, a.mo35534A().mo20506b()));
        agkw c = this.f65807a.mo35236c();
        if (c.mo35538v().mo35326g().booleanValue()) {
            agkt a2 = c.mo35593a(activity);
            if (c.f65832c == null) {
                agkt = c.f65833d;
            } else {
                agkt = c.f65832c;
            }
            if (a2.f65822b == null) {
                if (activity != null) {
                    str = c.mo35594a(activity.getClass().getCanonicalName());
                } else {
                    str = null;
                }
                a2 = new agkt(a2.f65821a, str, a2.f65823c);
            }
            c.f65833d = c.f65832c;
            c.f65832c = a2;
            c.mo35534A().mo20506b();
            c.mo35498F().mo35492a(new agku(c, agkt, a2));
            agcs g = c.mo35240g();
            g.mo35498F().mo35492a(new agcr(g, g.mo35534A().mo20506b()));
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        agkt agkt;
        agkw c = this.f65807a.mo35236c();
        if (c.mo35538v().mo35326g().booleanValue() && bundle != null && (agkt = (agkt) c.f65834e.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", agkt.f65823c);
            bundle2.putString("name", agkt.f65821a);
            bundle2.putString("referrer_name", agkt.f65822b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
