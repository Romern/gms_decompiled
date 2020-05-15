package com.google.android.chimera.config;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ChimeraApiVersion(added = 107)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FeatureRequestExtras {
    public static final int DOWNLOAD_RESULT_ERROR = 1;
    public static final int DOWNLOAD_RESULT_FAILURE = 2;
    public static final int DOWNLOAD_RESULT_OFFLINE = 4;
    public static final int DOWNLOAD_RESULT_TIMEOUT = 3;
    public static final int DOWNLOAD_RESULT_USER_CANCELED = 5;

    @ChimeraApiVersion(added = 107)
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public @interface DownloadResult {
    }

    @ChimeraApiVersion(added = 107)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class RequestBuilder {

        /* renamed from: a */
        private String f7671a;

        /* renamed from: a */
        private final Bundle m4862a() {
            Bundle bundle = new Bundle(2);
            bundle.putString("session_id", this.f7671a);
            return bundle;
        }

        public void addToBundle(Bundle bundle) {
            bundle.putBundle("chimera.feature_request_bundle", m4862a());
        }

        public void addToIntent(Intent intent) {
            intent.putExtra("chimera.feature_request_bundle", m4862a());
        }

        public RequestBuilder setSessionId(String str) {
            this.f7671a = str;
            return this;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class RequestReader {

        /* renamed from: a */
        private final Bundle f7672a;

        public RequestReader(Intent intent) {
            this.f7672a = intent.getBundleExtra("chimera.feature_request_bundle");
        }

        public String getSessionId() {
            Bundle bundle = this.f7672a;
            if (bundle != null) {
                return bundle.getString("session_id");
            }
            return null;
        }

        public boolean hasFeatureRequest() {
            return this.f7672a != null;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ResultBuilder {

        /* renamed from: a */
        private int f7673a;

        public void addToIntent(Intent intent) {
            Bundle bundle = new Bundle();
            bundle.putInt("download_status", this.f7673a);
            intent.putExtra("chimera.feature_response_bundle", bundle);
        }

        public ResultBuilder setDownloadResult(int i) {
            this.f7673a = i;
            return this;
        }
    }

    @ChimeraApiVersion(added = 107)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ResultReader {

        /* renamed from: a */
        private final Bundle f7674a;

        private ResultReader(Bundle bundle) {
            this.f7674a = bundle;
        }

        public static ResultReader fromIntent(Intent intent) {
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("chimera.feature_response_bundle") : null;
            if (bundleExtra != null) {
                return new ResultReader(bundleExtra);
            }
            return null;
        }

        public int getDownloadResultCode() {
            return this.f7674a.getInt("download_status", 1);
        }
    }
}
