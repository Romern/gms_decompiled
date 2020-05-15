package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppMeasurement {

    /* renamed from: a */
    private static volatile AppMeasurement f80081a;

    /* renamed from: b */
    private final agje f80082b;

    /* renamed from: c */
    private final agkn f80083c;

    /* renamed from: d */
    private final boolean f80084d;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Bundle mo43990a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                agjx.m54403a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }

        public ConditionalUserProperty(Bundle bundle) {
            sdo.m34959a(bundle);
            this.mAppId = (String) agjx.m54402a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) agjx.m54402a(bundle, "origin", String.class, null);
            this.mName = (String) agjx.m54402a(bundle, "name", String.class, null);
            this.mValue = agjx.m54402a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) agjx.m54402a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) agjx.m54402a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) agjx.m54402a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) agjx.m54402a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) agjx.m54402a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) agjx.m54402a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) agjx.m54402a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) agjx.m54402a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) agjx.m54402a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) agjx.m54402a(bundle, "active", Boolean.class, false)).booleanValue();
            this.mCreationTimestamp = ((Long) agjx.m54402a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) agjx.m54402a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(agje agje) {
        sdo.m34959a(agje);
        this.f80082b = agje;
        this.f80083c = null;
        this.f80084d = false;
    }

    public void beginAdUnitExposure(String str) {
        if (!this.f80084d) {
            agcs o = this.f80082b.mo35511o();
            sqv sqv = this.f80082b.f65696l;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (str == null || str.length() == 0) {
                o.mo35497E().f65564c.mo35435a("Ad unit id must be a non-empty string");
            } else {
                o.mo35498F().mo35492a(new agcp(o, str, elapsedRealtime));
            }
        } else {
            this.f80083c.mo35581f();
        }
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (!this.f80084d) {
            agkm e = this.f80082b.mo35501e();
            e.mo35242i();
            e.mo35574a((String) null, str, str2, bundle);
            return;
        }
        this.f80083c.mo35582g();
    }

    /* access modifiers changed from: protected */
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (!this.f80084d) {
            agkm e = this.f80082b.mo35501e();
            sdo.m34977c(str);
            e.mo35243j();
            e.mo35574a(str, str2, str3, bundle);
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    public void endAdUnitExposure(String str) {
        if (!this.f80084d) {
            agcs o = this.f80082b.mo35511o();
            sqv sqv = this.f80082b.f65696l;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (str == null || str.length() == 0) {
                o.mo35497E().f65564c.mo35435a("Ad unit id must be a non-empty string");
            } else {
                o.mo35498F().mo35492a(new agcq(o, str, elapsedRealtime));
            }
        } else {
            this.f80083c.mo35583h();
        }
    }

    public long generateEventId() {
        if (!this.f80084d) {
            return this.f80082b.mo35502f().mo35750d();
        }
        return this.f80083c.mo35580e();
    }

    public String getAppInstanceId() {
        if (this.f80084d) {
            return this.f80083c.mo35578c();
        }
        agkm e = this.f80082b.mo35501e();
        e.mo35242i();
        return (String) e.f65809c.get();
    }

    public List getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        if (!this.f80084d) {
            agkm e = this.f80082b.mo35501e();
            e.mo35242i();
            list = e.mo35563a((String) null, str, str2);
        } else {
            list = this.f80083c.mo35584i();
        }
        ArrayList arrayList = new ArrayList(list != null ? list.size() : 0);
        for (Bundle bundle : list) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public List getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (!this.f80084d) {
            agkm e = this.f80082b.mo35501e();
            sdo.m34977c(str);
            e.mo35243j();
            ArrayList a = e.mo35563a(str, str2, str3);
            ArrayList arrayList = new ArrayList(a.size());
            int size = a.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new ConditionalUserProperty((Bundle) a.get(i)));
            }
            return arrayList;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    public String getCurrentScreenClass() {
        if (this.f80084d) {
            return this.f80083c.mo35577b();
        }
        agkt p = this.f80082b.mo35501e().f65756y.mo35507k().mo35598p();
        if (p != null) {
            return p.f65822b;
        }
        return null;
    }

    public String getCurrentScreenName() {
        if (this.f80084d) {
            return this.f80083c.mo35576a();
        }
        agkt p = this.f80082b.mo35501e().f65756y.mo35507k().mo35598p();
        if (p != null) {
            return p.f65821a;
        }
        return null;
    }

    public String getGmpAppId() {
        if (this.f80084d) {
            return this.f80083c.mo35579d();
        }
        agkm e = this.f80082b.mo35501e();
        String str = e.f65756y.f65686b;
        if (str != null) {
            return str;
        }
        try {
            return new sdy(e.mo35542z()).mo25405a("google_app_id");
        } catch (IllegalStateException e2) {
            e.f65756y.mo35497E().f65564c.mo35436a("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public int getMaxUserProperties(String str) {
        if (this.f80084d) {
            return this.f80083c.mo35585j();
        }
        agkm e = this.f80082b.mo35501e();
        sdo.m34977c(str);
        e.mo35538v();
        return 25;
    }

    /* access modifiers changed from: protected */
    public Map getUserProperties(String str, String str2, boolean z) {
        if (this.f80084d) {
            return this.f80083c.mo35586k();
        }
        agkm e = this.f80082b.mo35501e();
        e.mo35242i();
        return e.mo35564a((String) null, str, str2, z);
    }

    /* access modifiers changed from: protected */
    public Map getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (!this.f80084d) {
            agkm e = this.f80082b.mo35501e();
            sdo.m34977c(str);
            e.mo35243j();
            return e.mo35564a(str, str2, str3, z);
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (!this.f80084d) {
            this.f80082b.mo35501e().mo35570a(str, str2, bundle);
        } else {
            this.f80083c.mo35587l();
        }
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        sdo.m34959a(conditionalUserProperty);
        if (this.f80084d) {
            agkn agkn = this.f80083c;
            conditionalUserProperty.mo43990a();
            agkn.mo35588m();
            return;
        }
        agkm e = this.f80082b.mo35501e();
        Bundle a = conditionalUserProperty.mo43990a();
        long a2 = e.mo35534A().mo20505a();
        sdo.m34959a(a);
        e.mo35242i();
        Bundle bundle = new Bundle(a);
        if (!TextUtils.isEmpty(bundle.getString("app_id"))) {
            e.mo35497E().f65567f.mo35435a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle.remove("app_id");
        e.mo35565a(bundle, a2);
    }

    /* access modifiers changed from: protected */
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        sdo.m34959a(conditionalUserProperty);
        if (!this.f80084d) {
            agkm e = this.f80082b.mo35501e();
            Bundle a = conditionalUserProperty.mo43990a();
            sdo.m34959a(a);
            sdo.m34977c(a.getString("app_id"));
            e.mo35243j();
            e.mo35565a(new Bundle(a), e.mo35534A().mo20505a());
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        agde.m54035a(context);
        if (f80081a == null) {
            synchronized (AppMeasurement.class) {
                if (f80081a == null) {
                    agkn agkn = null;
                    if (!agde.m54035a(context)) {
                        try {
                            try {
                                agkn = (agkn) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                            } catch (Exception e) {
                            }
                        } catch (ClassNotFoundException e2) {
                        }
                    }
                    if (agkn == null) {
                        f80081a = new AppMeasurement(agje.m54354a(context, new InitializationParams(0, 0, true, null, null, null, null)));
                    } else {
                        f80081a = new AppMeasurement(agkn);
                    }
                }
            }
        }
        return f80081a;
    }

    public AppMeasurement(agkn agkn) {
        sdo.m34959a(agkn);
        this.f80083c = agkn;
        this.f80082b = null;
        this.f80084d = true;
    }
}
