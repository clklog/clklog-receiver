package com.zcunsoft.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class LogBean {
    String kafkaDataTime = "";
    String projectName = "clklogapp";
    String projectToken = "";
    String clientIp = "";
    String crc = "";
    String isCompress = "";
    String logContext = "";
    String distinctId = "";
    String typeContext = "";
    String event = "";
    long time = 0;
    String trackId = "";
    long flushTime = 0;
    String country = "";
    String province = "";
    String city = "";
    //identity
    String identityCookieId = "";
    //lib
    String lib = "";
    String libMethod = "";
    String libVersion = "";
    //properties
    String timezoneOffset = "";
    String screenHeight = "";
    String screenWidth = "";
    String viewportHeight = "";
    String viewportWidth = "";
    String url = "";
    String urlPath = "";
    String referrer = "";
    String referrerHost = "";
    String title = "";
    Double eventDuration = 0D;
    String latestReferrer = "";
    String latestSearchKeyword = "";
    String latestTrafficSourceType = "";
    String isFirstDay = "";
    String isFirstTime = "";
    Timestamp logTime = null;
    String statDate = "";
    String statHour = "";
    String elementId = "";
    String appId = "";
    String appName = "";
    String appState = "";
    String appVersion = "";
    /**
     * 崩溃原因.
     */
    String appCrashedReason = "";
    String brand = "";
    String browser = "";
    String browserVersion = "";
    String carrier = "";
    String deviceId = "";
    String elementClassName = "";
    String elementContent = "";
    String elementName = "";
    String elementPosition = "";
    String elementSelector = "";
    String elementTargetUrl = "";
    String elementType = "";
    String firstChannelAdId = "";
    String firstChannelAdgroupId = "";
    String firstChannelCampaignId = "";
    String firstChannelClickId = "";
    String firstChannelName = "";
    String latestLandingPage = "";
    String latestReferrerHost = "";
    String latestScene = "";
    String latestShareMethod = "";
    String latestUtmCampaign = "";
    String latestUtmContent = "";
    String latestUtmMedium = "";
    String latestUtmSource = "";
    String latestUtmTerm = "";
    Double latitude;
    Double longitude;
    String manufacturer = "";
    String matchedKey = "";
    String matchingKeyList = "";
    String model = "";
    String networkType = "";
    String os = "";
    String osVersion = "";
    String receiveTime = "";
    String screenName = "";
    String screenOrientation = "";
    String shortUrlKey = "";
    String shortUrlTarget = "";
    String sourcePackageName = "";
    String trackSignupOriginalId = "";
    String userAgent = "";
    String utmCampaign = "";
    String utmContent = "";
    String utmMatchingType = "";
    String utmMedium = "";
    String utmSource = "";
    String utmTerm = "";
    Integer viewportPosition;
    String wifi = "";
    String userKey = "";
    Integer isLogined = 0;
    String downloadChannel = "";
    String eventSessionId = "";
    String rawUrl = "";
    String createTime = "";
    String internalSearchKeyword = "";
    /**
     * 匿名 ID.
     */
    String anonymousId;
}
