package com.felicanetworks.cmnctrl.net;

import android.os.Build;
import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.FunctionCodeInterface;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkAccess implements FunctionCodeInterface {
    private static final int BRANCH_API_LEVEL = 22;
    private BaseNetworkAccess targetAccess;

    public NetworkAccess(AppContext appContext) {
        int i = Build.VERSION.SDK_INT;
        this.targetAccess = new JavaNetworkAccess(appContext);
    }

    public void cancel() {
        this.targetAccess.cancel();
    }

    public NetworkAccessResponseData connect(NetworkAccessRequestData networkAccessRequestData) {
        return this.targetAccess.connect(networkAccessRequestData);
    }

    public int getClassCode() {
        return 3;
    }

    public int getFunctionCode() {
        return 4;
    }
}
