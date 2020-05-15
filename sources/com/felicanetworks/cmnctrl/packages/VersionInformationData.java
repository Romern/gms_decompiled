package com.felicanetworks.cmnctrl.packages;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VersionInformationData {
    public int version;
    public String versionName;

    public VersionInformationData(int i, String str) {
        this.version = i;
        this.versionName = str;
    }

    public String toString() {
        return "VersionInformationData[" + this.version + ", " + this.versionName + "]";
    }
}
